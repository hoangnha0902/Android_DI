package com.nhahv.mvvmarchitecturedagger.injection.component

import com.nhahv.mvvmarchitecturedagger.BaseViewModel
import com.nhahv.mvvmarchitecturedagger.injection.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface ViewModelInjector : AndroidInjector<BaseViewModel> {

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector
        fun networkModule(networkModule: AppModule): Builder
    }

}