package com.example.homework

import dagger.Module
import dagger.Provides


@Module
class HomeWorkModule {
    @Provides
    fun createCat():Cat{
        return Cat("Hodor",21)
    }
}