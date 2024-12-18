package com.example.cryptomonitoringapp.core.presentation.util

import android.content.Context
import com.example.cryptomonitoringapp.R
import com.example.cryptomonitoringapp.core.domain.util.NetworkError

fun NetworkError.toString(context: Context):String{
    val resId = when(this){
        NetworkError.REQUEST_TIMEOUT -> R.string.error_request_timeout
        NetworkError.TOO_MANY_REQUESTS -> R.string.too_many_requests
        NetworkError.NO_INTERNET -> R.string.no_internet
        NetworkError.SERVER_ERROR -> R.string.server_error
        NetworkError.SERIALIZATION_ERROR -> R.string.serialization_error
        NetworkError.UNKNOWN ->R.string.unkown_error
    }
    return context.getString(resId)
}