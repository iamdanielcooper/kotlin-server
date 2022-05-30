package com.terraceHouseServer.terraceHouseServer.service

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import io.mockk.mockk
import org.assertj.core.api.Assert
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SeasonServiceTest {

    private val dataSource: SeasonDataSource = mockk()
    private val seasonService = SeasonService(dataSource)

//    @Test
//    fun `Should call its datasource`() {
//        val seasons = seasonService.getSeasons()
//
//        Assertions.assertThat(seasons).isNotNull
//    }
}