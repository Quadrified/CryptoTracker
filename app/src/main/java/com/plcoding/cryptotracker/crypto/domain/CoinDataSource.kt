package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result

// "WHAT" do we need CoinDataSource to have
// Implementation in "crypto/data/networking/RemoteCoinDataSource"
// The "Repository"
interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
}