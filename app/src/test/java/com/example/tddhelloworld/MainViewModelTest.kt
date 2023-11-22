package com.example.tddhelloworld

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setUp() {
        Dispatchers.setMain(Dispatchers.Unconfined)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun test() {
        val viewModel: MainViewModel = MainViewModel()
        val liveData: LiveData<String> = viewModel.textLiveData
        assertEquals("0", liveData.value)

        viewModel.increment()
        assertEquals("1", liveData.value)

        viewModel.increment()
        assertEquals("2", liveData.value)
    }
}