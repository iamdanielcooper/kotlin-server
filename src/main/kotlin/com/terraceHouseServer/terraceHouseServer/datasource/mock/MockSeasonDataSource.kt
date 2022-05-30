package com.terraceHouseServer.terraceHouseServer.datasource.mock

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import org.springframework.stereotype.Repository

@Repository
class MockSeasonDataSource: SeasonDataSource {

    private val seasons =
        listOf(
            Season(id = "12", name = "Dan", code = "123", totalCouples = 1, totalDates = 1, totalEpisodes = 1, totalHousemates = 3),
            Season(id = "34", name = "Dan", code = "123", totalCouples = 1, totalDates = 1, totalEpisodes = 1, totalHousemates = 3)
        )

    override fun getSeasons(): Collection<Season> = seasons

}