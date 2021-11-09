package com.example.homework.DI

import com.example.homework.*
import com.example.homework.ENTITY.Parrot
import com.example.homework.UI.BlankFragment1
import dagger.BindsInstance
import dagger.Component

@Component(modules = [ViewModelModule::class, HomeWorkModule ::class])
interface HomeWorkComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun createParrot(parrot: Parrot): Builder
        fun build(): HomeWorkComponent
    }
    fun inject(mainActivity: MainActivity)
    fun inject(blankFragment1: BlankFragment1)

}