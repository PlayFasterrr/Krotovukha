package com.example.krotovukha

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class Data: ViewModel() {
    val something : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val hat: MutableLiveData<Any> by lazy {
        MutableLiveData<Any>()
    }
}