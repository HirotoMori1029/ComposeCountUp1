package com.hirogram.composecountup1

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlin.math.pow

class CountViewModel: ViewModel() {
    //カウントの回数を保持する
    val count: MutableState<Int> = mutableStateOf(1)

    //カウントアップボタンのクリックイベント
    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        count.value = 2.0.pow(currentValue.toDouble()).toInt()

    }

    fun onClearTapped() {
        count.value = 1
    }

}