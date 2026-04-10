FROM registry.access.redhat.com/ubi8/ubi-minimal:8.8
RUN microdnf module enable nginx:1.20
RUN microdnf install nginx

COPY dist /opt/idp-settings
COPY docker/nginx.conf /etc/nginx/
COPY docker/entrypoint.sh /opt

WORKDIR /opt/idp-settings

RUN chown 65534:65534 -R /opt/idp-settings
RUN chown 65534:65534 -R /var/log/nginx
USER 65534

EXPOSE 8080
ENTRYPOINT ["sh", "/opt/entrypoint.sh"]
