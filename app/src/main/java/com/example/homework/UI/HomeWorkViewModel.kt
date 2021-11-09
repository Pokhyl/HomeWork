package com.example.homework.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.homework.UI.HomeWorkRepository
import javax.inject.Inject

class HomeWorkViewModel @Inject constructor(var repository: HomeWorkRepository): ViewModel() {
  var liveData = MutableLiveData<String>()
    init {
        liveData.value = repository.s
    }
}