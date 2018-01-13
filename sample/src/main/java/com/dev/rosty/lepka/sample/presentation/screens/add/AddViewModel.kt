package com.dev.rosty.lepka.sample.presentation.screens.add

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import com.dev.rosty.lepka.lib.Lepka
import com.dev.rosty.lepka.lib.screen.Data
import com.dev.rosty.lepka.lib.command.Forward
import com.dev.rosty.lepka.lib.command.ForwardClear
import com.dev.rosty.lepka.sample.AddScreen
import com.dev.rosty.lepka.sample.injection.screen.ScreenComponent
import javax.inject.Inject


class AddViewModel : ViewModel(), ScreenComponent.Injectable {

    @Inject lateinit var data: Data<Int>
    @Inject lateinit var lepka: Lepka

    var text = ObservableField ("")


    override fun inject(screenComponent: ScreenComponent) {

        screenComponent.inject(this)

        text.set(data.get().toString())
    }


    fun onAddTap() {

        lepka.execute(
                if (data.get() < 5) Forward(AddScreen(Data(data.get() + 1)))
                else ForwardClear(AddScreen(Data(0))))
    }
}
