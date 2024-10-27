package com.plcoding.cryptotracker.di

import com.plcoding.cryptotracker.core.data.networking.HttpClientFactory
import com.plcoding.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import com.plcoding.cryptotracker.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

// Dependencies bound to the lifecycle of the App module
// Singletons

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    // singleOf => when there is a constructor and Koin knows what those dependencies are
    // .bind<CoinDataSource>() => since RemoteCoinDataSource is a concrete impl and not abstract one
    // we specify which Repository/Interface this is implementing
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    // To inject ViewModel where needed (Eg. Navigation)
    viewModelOf(::CoinListViewModel)
}