package com.ilker.applicationpt1.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var cnt = 0

    init {
        cnt = 0
    }

    fun onClick() {
        cnt++
    }
}