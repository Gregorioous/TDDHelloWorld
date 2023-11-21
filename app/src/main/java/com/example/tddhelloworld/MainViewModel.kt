package com.example.tddhelloworld

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel {
    private var state = 0
    private val innerLiveData = MutableLiveData<String>()
    val textLiveData: LiveData<String>
        get() = innerLiveData

    init {
        innerLiveData.value = state.toString()
    }

    fun increment() {
        innerLiveData.value = (++state).toString()
    }
}
