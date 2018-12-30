package com.nhahv.mvvmarchitecturedagger.injection.component

import android.app.Application
import com.nhahv.mvvmarchitecturedagger.AppApplication
import com.nhahv.mvvmarchitecturedagger.injection.module.ActivityModule
import com.nhahv.mvvmarchitecturedagger.injection.module.AppModule
import com.nhahv.mvvmarchitecturedagger.injection.module.FragmentModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, AppModule::class, FragmentModule::class])
interface AppComponent : AndroidInjector<AppApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}