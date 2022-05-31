package com.terraceHouseServer.terraceHouseServer.datasource

import com.terraceHouseServer.terraceHouseServer.model.Season

interface SeasonDataSource {
    fun getSeasons(): Collection<Season>

    fun addSeason(season: Season): Collection<Season>

    fun deleteSeason(id: String): Collection<Season>
}