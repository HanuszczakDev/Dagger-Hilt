package com.hanuszczak.dagger_hilt.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}