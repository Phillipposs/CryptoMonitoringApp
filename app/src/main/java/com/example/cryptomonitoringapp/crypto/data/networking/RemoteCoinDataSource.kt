package com.example.cryptomonitoringapp.crypto.data.networking

import com.example.cryptomonitoringapp.core.data.networking.constructUrl
import com.example.cryptomonitoringapp.core.data.networking.safeCall
import com.example.cryptomonitoringapp.core.domain.util.NetworkError
import com.example.cryptomonitoringapp.core.domain.util.Result
import com.example.cryptomonitoringapp.core.domain.util.map
import com.example.cryptomonitoringapp.crypto.data.mappers.toCoin
import com.example.cryptomonitoringapp.crypto.data.networking.dto.CoinsResponseDto
import com.example.cryptomonitoringapp.crypto.domain.Coin
import com.example.cryptomonitoringapp.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
):CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinsResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}