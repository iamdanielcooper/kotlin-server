package com.terraceHouseServer.terraceHouseServer.datasource.mock

import com.terraceHouseServer.terraceHouseServer.datasource.SeasonDataSource
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockSeasonDataSourceTest {

    private val MockDataSource = MockSeasonDataSource()

    @Test
    fun `Should provide a collection of seasons`() {
        val seasons = MockDataSource.getSeasons()
        Assertions.assertThat(seasons).isNotEmpty
    }

    @Test
    fun `Seasons should return mock data`() {
        val seasons = MockDataSource.getSeasons()
        assertThat(seasons).allMatch {
            it.id.isNotBlank()

        }
        assertThat(seasons.stream().findFirst().get().id).isEqualTo("12")
    }
}