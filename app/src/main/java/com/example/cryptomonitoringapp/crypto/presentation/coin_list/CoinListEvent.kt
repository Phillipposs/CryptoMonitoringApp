package com.example.cryptomonitoringapp.crypto.presentation.coin_list

import com.example.cryptomonitoringapp.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}