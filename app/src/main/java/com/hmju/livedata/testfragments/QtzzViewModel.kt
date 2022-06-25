package com.hmju.livedata.testfragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QtzzViewModel : ViewModel() {
    val startQtzzFragmentEvent: MutableLiveData<Long> by lazy { MutableLiveData() }

    fun onMoveFragment() {
        startQtzzFragmentEvent.value = System.currentTimeMillis()
    }
}