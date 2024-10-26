package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError : Error {
    REQUEST_TIMEOUT,
    TOO_MAY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
}