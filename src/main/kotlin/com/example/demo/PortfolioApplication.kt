package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PortfolioApplication

fun main(args: Array<String>) {
	runApplication<PortfolioApplication>(*args)

}
