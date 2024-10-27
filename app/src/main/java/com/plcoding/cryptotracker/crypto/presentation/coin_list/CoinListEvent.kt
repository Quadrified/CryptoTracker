package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.core.domain.util.NetworkError

// Events from ViewModel (eg. one time Toast/Snackbar) ==<to>==> Screen
sealed interface CoinListEvent {
    data class Error(val error: NetworkError) : CoinListEvent
}