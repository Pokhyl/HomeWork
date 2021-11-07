package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var homeWorkComponent: HomeWorkComponent
    @Inject
    lateinit var dog: Dog
    @Inject
    lateinit var cat: Cat
    @Inject
    lateinit var parrot: Parrot
    override fun onCreate(savedInstanceState: Bundle?) {
       homeWorkComponent = (applicationContext as HomeWorkApp).homeWorkComponent
        homeWorkComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(dog)
        println(parrot.name)
        println(cat.name+" "+cat.age)
    }
}