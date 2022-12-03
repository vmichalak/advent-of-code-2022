package com.vmichalak.adc2022

import java.lang.IllegalArgumentException

/**
 * Advent of Code 2022 - Day 3
 * https://adventofcode.com/2022/day/3
 */
object Day03 {
    private inline infix fun String.intersect(other: String) = this.toSet() intersect other.toSet()
    private inline infix fun Iterable<Char>.intersect(other: String) = this intersect other.toSet()

    private fun toPriority(value: Char): Int = when(value) {
        in ('a'..'z') -> value - 'a' + 1
        in ('A'..'Z') -> value - 'A' + 27
        else -> throw IllegalArgumentException()
    }

    fun part1(value: List<String>): Int = value
        .map { it.chunked(it.length / 2) }
        .sumOf { (a, b) -> (a intersect b).sumOf { toPriority(it) } }

    fun part2(value: List<String>): Int = value
        .chunked(3)
        .sumOf { (a, b, c) -> (a intersect b intersect c).sumOf { toPriority(it) } }
}
