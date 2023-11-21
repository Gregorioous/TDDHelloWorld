package com.example.tddhelloworld

import androidx.lifecycle.LiveData
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainViewModelTest {
    @Test
    fun test() {
        val viewModel:MainViewModel = MainViewModel()
        val liveData: LiveData<String> = viewModel.textLiveData
        assertEquals("0", liveData.value)

        viewModel.increment()
        assertEquals("1", liveData.value)

        viewModel.increment()
        assertEquals("2", liveData.value)
    }
}