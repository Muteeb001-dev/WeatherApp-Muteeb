package com.example.muteebweatherapp

data class ForecastResponse(
    val list: List<ForecastItem>
)

data class ForecastItem(
    val main: Main
)
