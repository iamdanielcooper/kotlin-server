package com.terraceHouseServer.terraceHouseServer.controller

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import com.terraceHouseServer.terraceHouseServer.service.SeasonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/seasons")
class SeasonController(private val service: SeasonService) {


    private val season =
        Season(id = "56", name = "Dan", code = "123", totalCouples = 1, totalDates = 1, totalEpisodes = 1, totalHousemates = 3)


    @GetMapping
    fun getSeasons(): Collection<Season> = service.getSeasons()

    @PostMapping
    fun addSeason(): Collection<Season> = service.addSeason(season)

}