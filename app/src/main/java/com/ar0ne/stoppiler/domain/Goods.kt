package com.ar0ne.stoppiler.domain

enum class GoodsType {
    FOOD,
    WATER,
    HOME,
    // @TODO: add rest types
}

enum class Priority {
    LOW, MEDIUM, HIGH
}

enum class Units (val repr: String) {
    METER("m"),
    GRAM("gr"),
    LITER("l"),
}


data class Goods(
    val name: String,
    val type: GoodsType,
    val dailyRate: Double,
    val unit: Units = Units.GRAM,
    val priority: Priority = Priority.LOW
)
