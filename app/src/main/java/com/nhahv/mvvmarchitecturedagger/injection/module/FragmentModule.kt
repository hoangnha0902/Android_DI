package com.nhahv.mvvmarchitecturedagger.injection.module

import com.nhahv.mvvmarchitecturedagger.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainFragment(): MainFragment

}