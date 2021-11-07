package com.example.homework

import dagger.BindsInstance
import dagger.Component

@Component(modules = [ViewModelModule::class, HomeWorkModule ::class])
interface HomeWorkComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun createParrot(parrot: Parrot):Builder
        fun build():HomeWorkComponent
    }
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment1: BlankFragment1)

}