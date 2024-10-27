package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

// Actual response returned from the API
@Serializable
data class CoinsResponseDto(
    val data: List<CoinDto>
)
