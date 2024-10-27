package com.plcoding.cryptotracker.crypto.domain

import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import java.time.ZonedDateTime

// "WHAT" do we need CoinDataSource to have
// Implementation in "crypto/data/networking/RemoteCoinDataSource"
// The "Repository"
interface CoinDataSource {
    // To get list of coins
    suspend fun getCoins(): Result<List<Coin>, NetworkError>

    // To get price change History of a particular coin (for Coin Graph in CoinDetailScreen)
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}