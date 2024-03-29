package com.example.myapplication.ui.hostelers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HostelersViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Hostelers Fragment"
    }
    val text: LiveData<String> = _text
}