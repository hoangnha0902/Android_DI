package com.nhahv.mvvmarchitecturedagger

import android.arch.lifecycle.ViewModel
import com.nhahv.mvvmarchitecturedagger.injection.component.DaggerViewModelInjector
import com.nhahv.mvvmarchitecturedagger.injection.module.AppModule
import com.nhahv.mvvmarchitecturedagger.ui.main.MainViewModel

abstract class BaseViewModel : ViewModel() {

    private val injector = DaggerViewModelInjector.builder().networkModule(AppModule).build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is MainViewModel -> injector.inject(this)
        }
    }
}