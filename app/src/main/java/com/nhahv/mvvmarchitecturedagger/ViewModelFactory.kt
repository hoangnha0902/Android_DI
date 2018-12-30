package com.nhahv.mvvmarchitecturedagger

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.nhahv.mvvmarchitecturedagger.ui.history.HistoryViewModel
import com.nhahv.mvvmarchitecturedagger.ui.main.MainViewModel
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Suppress("UNCHECKED_CAST")
@Singleton
class ViewModelFactory() : ViewModelProvider.NewInstanceFactory() {
    @Inject
    lateinit var mainViewModel: Provider<MainViewModel>

    @Inject
    lateinit var historyViewModel: Provider<HistoryViewModel>

    override fun <T : ViewModel?> create(modelClass: Class<T>): T = with(modelClass) {
        when {
            isAssignableFrom(MainViewModel::class.java) ->
                mainViewModel.get()
            isAssignableFrom(HistoryViewModel::class.java) ->
                historyViewModel.get()
            else ->
                throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
        }
    } as T
}