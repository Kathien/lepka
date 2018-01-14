package com.dev.rosty.lepka.sample.presentation.screens.authorization

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.dev.rosty.lepka.sample.R
import com.dev.rosty.lepka.sample.databinding.FragmentAuthorizationBinding
import com.dev.rosty.lepka.sample.presentation.base.ScreenFragment


class AuthorizationFragment : ScreenFragment<AuthorizationViewModel, FragmentAuthorizationBinding>() {

    override fun getViewModelClass() = AuthorizationViewModel::class.java

    override fun inflateBinding(inflater: LayoutInflater?, container: ViewGroup?, state: Bundle?) {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_authorization, container, false)
        binding.viewModel = viewModel;
    }
}