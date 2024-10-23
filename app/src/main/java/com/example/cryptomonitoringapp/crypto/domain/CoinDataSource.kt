package com.example.cryptomonitoringapp.crypto.domain

import com.example.cryptomonitoringapp.core.domain.util.NetworkError
import com.example.cryptomonitoringapp.core.domain.util.Result

interface CoinDataSource {
    suspend fun getCoins():Result<List<Coin>,NetworkError>
}