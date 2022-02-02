package com.idonuntius.androidstarter.repository

import com.idonuntius.androidstarter.model.Test

interface MainRepository {
    suspend fun getTest(): Test
}
