package com.hirogram.composecountup1

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class CountViewModel {
    //カウントの回数を保持する
    val count: MutableState<Int> = mutableStateOf(0)

    //カウントアップボタンのクリックイベント
    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        count.value = currentValue + 1
    }

}