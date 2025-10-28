package com.generalmobile.app.kotlinmvvmstarterproject.di.component

import android.content.Context
import android.content.SharedPreferences
import com.generalmobile.app.kotlinmvvmstarterproject.App
import com.generalmobile.app.kotlinmvvmstarterproject.di.module.ApplicationModule
import com.generalmobile.app.kotlinmvvmstarterproject.di.module.DatabaseModule
import com.generalmobile.app.kotlinmvvmstarterproject.ui.main.MainActivityViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton


@Component(modules = arrayOf(ApplicationModule::class,DatabaseModule::class))

interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
