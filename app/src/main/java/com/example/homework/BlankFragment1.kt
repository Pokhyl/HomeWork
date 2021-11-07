package com.example.homework

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import javax.inject.Inject


class BlankFragment1 : Fragment() {
    @Inject
    lateinit var dog:Dog
    @Inject
    lateinit var parrot: Parrot
    @Inject
    lateinit var cat: Cat
    @Inject
   lateinit var viewModelFactory: ViewModelFactory
lateinit var viewModel: HomeWorkViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this, viewModelFactory)
            .get(HomeWorkViewModel::class.java)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank1, container, false)
        (requireActivity() as MainActivity).homeWorkComponent.inject(this)
        println(dog)
        println(parrot.name)
        println(cat.name+" "+cat.age)
        println(viewModel)
    }
}