package com.idonuntius.androidstarter.api

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object ApiModule {
    @Singleton
    @Provides
    fun provideGithubService(requester: Requester): GithubService {
        return requester.create(GithubService::class)
    }
}
