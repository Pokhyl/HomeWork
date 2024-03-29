package com.example.homework.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.homework.ENTITY.Cat
import com.example.homework.ENTITY.Dog
import com.example.homework.ENTITY.Parrot
import com.example.homework.MainActivity
import com.example.homework.R
import javax.inject.Inject


class BlankFragment1 : Fragment() {
    @Inject
    lateinit var dog: Dog
    @Inject
    lateinit var parrot: Parrot
    @Inject
    lateinit var cat: Cat
    @Inject
   lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: HomeWorkViewModel by viewModels {
        viewModelFactory
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (requireActivity() as MainActivity).homeWorkComponent.inject(this)
//        viewModel = ViewModelProviders.of(this, viewModelFactory)
//            .get(HomeWorkViewModel::class.java)
println("$viewModelFactory !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        println(dog)
        println(parrot.name)
        println(cat.name+" "+cat.age)
        viewModel.liveData.observe(viewLifecycleOwner,{ println(it+"????????????????????????????????????????????????????????")} )
        return inflater.inflate(R.layout.fragment_blank1, container, false)


    }
}