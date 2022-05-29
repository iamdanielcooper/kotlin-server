package com.terraceHouseServer.terraceHouseServer.datasource

import com.terraceHouseServer.terraceHouseServer.model.Season

interface SeasonDataSource {
    fun getSeasons(): Collection<Season>
}