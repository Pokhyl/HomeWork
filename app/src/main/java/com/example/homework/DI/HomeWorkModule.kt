package com.example.homework.DI

import com.example.homework.ENTITY.Cat
import dagger.Module
import dagger.Provides


@Module
class HomeWorkModule {
    @Provides
    fun createCat(): Cat {
        return Cat("Hodor",21)
    }
}