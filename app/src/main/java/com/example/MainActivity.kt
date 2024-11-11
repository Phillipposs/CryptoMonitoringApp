package com.example

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.cryptomonitoringapp.core.navigation.AdaptiveCoinListDetailPane
import com.example.cryptomonitoringapp.core.presentation.util.ObserveAsEvents
import com.example.cryptomonitoringapp.core.presentation.util.toString
import com.example.cryptomonitoringapp.crypto.presentation.coin_detail.CoinDetailScreen
import com.example.cryptomonitoringapp.crypto.presentation.coin_list.CoinListEvent
import com.example.cryptomonitoringapp.crypto.presentation.coin_list.CoinListViewModel
import com.example.cryptomonitoringapp.presentation.coin_list.CoinListScreen
import com.example.ui.theme.CryptoMonitoringAppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoMonitoringAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AdaptiveCoinListDetailPane(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
