package com.hanuszczak.dagger_hilt.data.repository

import android.app.Application
import com.hanuszczak.dagger_hilt.R
import com.hanuszczak.dagger_hilt.data.remote.MyApi
import com.hanuszczak.dagger_hilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi,
    private val appContext: Application
) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from repository. App name is: $appName")
    }

    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

}