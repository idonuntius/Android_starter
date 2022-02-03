package com.idonuntius.androidstarter.api

import com.idonuntius.androidstarter.model.Me
import retrofit2.http.GET

interface GithubService {
    @GET("users/idonuntius")
    suspend fun getMe(): Me
}
