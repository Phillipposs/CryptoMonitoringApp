package com.example.cryptomonitoringapp

import android.app.Application
import com.example.cryptomonitoringapp.core.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CryptoMonitoringApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CryptoMonitoringApp)
            androidLogger()

            modules(appModule)
        }
    }
}