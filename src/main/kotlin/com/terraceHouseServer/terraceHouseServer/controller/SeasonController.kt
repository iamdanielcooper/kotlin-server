package com.terraceHouseServer.terraceHouseServer.controller

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import com.terraceHouseServer.terraceHouseServer.service.SeasonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/seasons/")
class SeasonController(private val service: SeasonService) {

    @GetMapping
    fun getSeasons(): Collection<Season> {
        return service.getSeasons()
    }
}