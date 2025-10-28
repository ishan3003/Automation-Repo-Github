package com.generalmobile.app.kotlinmvvmstarterproject

import com.generalmobile.app.kotlinmvvmstarterproject.di.component.DaggerApplicationComponent
import com.generalmobile.app.kotlinmvvmstarterproject.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

