package com.example.dagger.viewmodel

import androidx.lifecycle.ViewModel
import com.example.dagger.api.NewsApi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    api : NewsApi,

) : ViewModel() {

    init {
        
    }
}