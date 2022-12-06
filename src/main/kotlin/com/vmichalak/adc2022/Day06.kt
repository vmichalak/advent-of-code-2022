package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 6
 * https://adventofcode.com/2022/day/6
 */
object Day06 {
    private fun String.allUnique(): Boolean = all(hashSetOf<Char>()::add)

    private fun findMarker(content: String, markerSize: Int) =
        content.windowedSequence(markerSize).indexOfFirst { it.allUnique() } + markerSize

    fun part1(input: String): Int = findMarker(input, 4)
    fun part2(input: String): Int = findMarker(input, 14)
}
