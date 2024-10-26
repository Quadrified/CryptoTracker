package com.plcoding.cryptotracker.core.data.networking

import com.plcoding.cryptotracker.BuildConfig

// To create type of URL to call API
fun constructUrl(url: String): String {
    return when {
        // returns "https://api.coincap.io/v2/"
        url.contains(BuildConfig.BASE_URL) -> url

        // If url has relative paths "/" returns url + relative path
        // Eg. if url => "/assets" returns => "https://api.coincap.io/v2/assets"
        url.startsWith("/") -> BuildConfig.BASE_URL + url.drop(1)

        // Eg. if url => "assets" returns => "https://api.coincap.io/v2/assets"
        else -> BuildConfig.BASE_URL + url
    }
}