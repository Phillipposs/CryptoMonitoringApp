package com.example.cryptomonitoringapp.core.di

import com.example.cryptomonitoringapp.core.data.networking.HttpClientFactory
import com.example.cryptomonitoringapp.crypto.data.networking.RemoteCoinDataSource
import com.example.cryptomonitoringapp.crypto.domain.CoinDataSource
import com.example.cryptomonitoringapp.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create())}
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}