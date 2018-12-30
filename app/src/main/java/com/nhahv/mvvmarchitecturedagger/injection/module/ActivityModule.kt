package com.nhahv.mvvmarchitecturedagger.injection.module

import com.nhahv.mvvmarchitecturedagger.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeActivityInjector(): MainActivity
}