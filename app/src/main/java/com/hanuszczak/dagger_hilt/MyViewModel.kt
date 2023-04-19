package com.hanuszczak.dagger_hilt

import androidx.lifecycle.ViewModel
import com.hanuszczak.dagger_hilt.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
) : ViewModel(){
}