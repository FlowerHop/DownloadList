package com.flowerhop.downloadlist.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AnyViewModelFactory<T>(val creator: () -> T): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return creator() as T
    }
}