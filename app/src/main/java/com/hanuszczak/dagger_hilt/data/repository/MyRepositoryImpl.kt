package com.hanuszczak.dagger_hilt.data.repository

import com.hanuszczak.dagger_hilt.data.remote.MyApi
import com.hanuszczak.dagger_hilt.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
) : MyRepository {
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }

}