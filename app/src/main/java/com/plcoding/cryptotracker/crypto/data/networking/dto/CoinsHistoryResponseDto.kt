package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

// Actual response returned from the API
@Serializable
data class CoinsHistoryResponseDto(
    val data: List<CoinPriceDto>
)
