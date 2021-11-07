package com.example.homework

import android.app.Application

class HomeWorkApp:Application() {
    lateinit var homeWorkComponent: HomeWorkComponent
    override fun onCreate() {
        super.onCreate()
        homeWorkComponent = DaggerHomeWorkComponent
            .builder()
            .createParrot(Parrot("Kesha"))
            .build()
    }
}