package com.example.homework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeWorkViewModel @Inject constructor(var repository: HomeWorkRepository): ViewModel() {
  var liveData = MutableLiveData<String>()
    init {
        liveData.value = repository.s
    }
}