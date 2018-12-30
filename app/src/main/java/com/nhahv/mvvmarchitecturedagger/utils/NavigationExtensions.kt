package com.nhahv.mvvmarchitecturedagger.utils

import android.os.Bundle
import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import androidx.navigation.Navigation
import com.nhahv.mvvmarchitecturedagger.R


fun Fragment.navController() = Navigation.findNavController(requireActivity(), R.id.nav_host)

fun Fragment.navigate(@IdRes actionNavigation: Int, bundle: Bundle = Bundle()) {
    navController().navigate(actionNavigation, bundle)
}
