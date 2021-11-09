package com.example.homework.DI


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.homework.UI.HomeWorkViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeWorkViewModel::class)
    abstract fun bindsBaseSetupViewModel(baseSetupViewModel: HomeWorkViewModel): ViewModel


}