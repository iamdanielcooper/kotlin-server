package com.terraceHouseServer.terraceHouseServer.service

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class SeasonService(private val dataSource: SeasonDataSource) {
    fun getSeasons(): Collection<Season> = dataSource.getSeasons()

    fun addSeason(season: Season): Collection<Season> = dataSource.addSeason(season)
}