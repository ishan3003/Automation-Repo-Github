package com.generalmobile.app.kotlinmvvmstarterproject.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.generalmobile.app.kotlinmvvmstarterproject.R
import com.generalmobile.app.kotlinmvvmstarterproject.core.BaseActivity
import com.generalmobile.app.kotlinmvvmstarterproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun initViewModel(viewModel: MainActivityViewModel) {
        binding.viewModel = viewModel
    }

    override fun getLayoutRes() = R.layout.activity_main
}
