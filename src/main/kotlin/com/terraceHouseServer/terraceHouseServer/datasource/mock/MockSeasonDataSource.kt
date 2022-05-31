package com.terraceHouseServer.terraceHouseServer.datasource.mock

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import org.springframework.stereotype.Repository

@Repository
class MockSeasonDataSource: SeasonDataSource {

    private val seasonOne = Season(id = "12", name = "Dan", code = "123", totalCouples = 1, totalDates = 1, totalEpisodes = 1, totalHousemates = 3)
    private val seasonTwo = Season(id = "34", name = "Dan", code = "123", totalCouples = 1, totalDates = 1, totalEpisodes = 1, totalHousemates = 3)


    private val seasons =
        mutableListOf<Season>(seasonOne, seasonTwo)


    override fun getSeasons(): Collection<Season> = seasons
    override fun addSeason(season: Season): Collection<Season>  {
        seasons.add(season)
        return seasons
    }

    override fun deleteSeason(id: String): Collection<Season> {
        val targetSeason = seasons.filter { it.id == id }
            .firstOrNull()
        seasons.remove(targetSeason)
        return seasons
    }

}