package com.terraceHouseServer.terraceHouseServer.controller

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import com.terraceHouseServer.terraceHouseServer.model.Season
import com.terraceHouseServer.terraceHouseServer.service.SeasonService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/seasons")
class SeasonController(private val service: SeasonService) {

    @GetMapping
    fun getSeasons(): Collection<Season> = service.getSeasons()

    @PostMapping
    fun addSeason(@RequestBody body: Season): Collection<Season> = service.addSeason(body)

    @DeleteMapping
    fun deleteSeason(@RequestParam id: String): Collection<Season> = service.deleteSeason(id)
}