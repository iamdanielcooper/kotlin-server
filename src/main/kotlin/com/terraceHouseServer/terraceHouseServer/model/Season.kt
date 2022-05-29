package com.terraceHouseServer.terraceHouseServer.model

data class Season (
    val id: String,
    private val name: String,
    private val code: String,
    private val totalHousemates: Int,
    private val totalEpisodes: Int,
    private val totalDates: Int,
    private val totalCouples: Int)