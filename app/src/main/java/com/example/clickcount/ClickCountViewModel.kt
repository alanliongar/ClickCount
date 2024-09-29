package com.example.clickcount

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ClickCountViewModel() : ViewModel() {
    private val _uiState = MutableStateFlow(0)

    val uiState: StateFlow<Int> = _uiState

    fun increment() {
        _uiState.value++
    }
}