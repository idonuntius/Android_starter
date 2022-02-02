package com.idonuntius.androidstarter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.idonuntius.androidstarter.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {
    private val _text = MutableStateFlow("hoge")
    val text = _text.asStateFlow()

    init {
        viewModelScope.launch {
            val test = mainRepository.getTest()
            _text.value = test.toString()
        }
    }
}
