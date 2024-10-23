package com.example.cryptomonitoringapp.crypto.presentation.coin_list

import com.example.cryptomonitoringapp.presentation.models.CoinUi

sealed interface CoinListAction {
     data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}