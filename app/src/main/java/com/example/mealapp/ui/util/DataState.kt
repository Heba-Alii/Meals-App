package com.example.mealapp.ui.util

sealed class DataState<out T> {
    data class Success<out T>(val data: T) : DataState<T>()
    data class Failure(val throwable: Throwable) : DataState<Nothing>()
    data class Loading(val isLoading: Boolean) : DataState<Nothing>()
}


