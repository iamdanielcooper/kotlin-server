package com.terraceHouseServer.terraceHouseServer.model

data class Season (
    val id: String,
    val name: String,
    val code: String,
    val totalHousemates: Int,
    val totalEpisodes: Int,
    val totalDates: Int,
    val totalCouples: Int
    )