package com.example.homework

import android.app.Application
import com.example.homework.DI.HomeWorkComponent
import com.example.homework.ENTITY.Parrot

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