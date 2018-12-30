package com.nhahv.mvvmarchitecturedagger

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.nhahv.mvvmarchitecturedagger.injection.component.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class AppApplication : Application(), HasActivityInjector, HasSupportFragmentInjector {
    @Inject
    lateinit var bindActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var bindFragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }

    override fun activityInjector() = bindActivityInjector
    override fun supportFragmentInjector() = bindFragmentInjector
}