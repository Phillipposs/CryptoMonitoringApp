package com.example.cryptomonitoringapp.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinsHistoryDto(
    val data : List<CoinPriceDto>
)
