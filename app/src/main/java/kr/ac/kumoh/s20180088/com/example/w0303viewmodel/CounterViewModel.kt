package kr.ac.kumoh.s20180088.com.example.w0303viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {
    private var _count = MutableLiveData<Int>(0)
    val count: LiveData<Int>
        get() = _count

    fun add(){
        _count.value = _count.value?.plus(1)
    }
}