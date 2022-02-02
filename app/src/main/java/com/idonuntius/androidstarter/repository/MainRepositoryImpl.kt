package com.idonuntius.androidstarter.repository

import com.idonuntius.androidstarter.model.Test
import kotlinx.coroutines.delay
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor() : MainRepository {
    override suspend fun getTest(): Test {
        delay(1000)
        return Test(title = "title", description = "description")
    }
}
