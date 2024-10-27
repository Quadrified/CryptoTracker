package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi

// Actions taken by user in Screen (eg. clicking coin list item) ==<to>==> ViewModel
sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi) : CoinListAction

    // TODO: Homework
//    data object OnRefresh : CoinListAction
}