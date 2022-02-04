package com.idonuntius.androidstarter.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Me(
    @SerialName("login")
    val login: String,
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("avatar_url")
    val avatarUrl: String
)
