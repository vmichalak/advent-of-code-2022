package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 1
 * https://adventofcode.com/2022/day/1
 */
object Day01 {
    private fun mapToElves(calories: String): List<List<Int>> = calories
        .split("\n\n")
        .map { group -> group.split("\n").mapNotNull { it.toIntOrNull() } }

    fun part1(calories: String): Int = mapToElves(calories).maxOf { it.sum() }
    fun part2(calories: String): Int = mapToElves(calories).map { it.sum() }.sortedByDescending { it }.take(3).sum()
}