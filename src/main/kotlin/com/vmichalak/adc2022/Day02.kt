package com.vmichalak.adc2022

import java.lang.IllegalArgumentException

/**
 * Advent of Code 2022 - Day 2
 * https://adventofcode.com/2022/day/2
 */
object Day02 {
    fun part1(games: List<String>): Int = games.sumOf {
        when (it) {
            "A Y", "B Z", "C X" -> 6
            "A X", "B Y", "C Z" -> 3
            "A Z", "B X", "C Y" -> 0
            else                -> throw IllegalArgumentException()
        } + when (it[2]) {
            'Z'  -> 3
            'Y'  -> 2
            'X'  -> 1
            else -> throw IllegalArgumentException()
        }
    }

    fun part2(games: List<String>): Int = games.sumOf {
        when (it) {
            "A X", "B Z", "C Y" -> 3
            "A Z", "B Y", "C X" -> 2
            "A Y", "B X", "C Z" -> 1
            else                -> throw IllegalStateException()
        } + when (it[2]) {
            'Z'  -> 6
            'Y'  -> 3
            'X'  -> 0
            else -> throw IllegalStateException()
        }
    }
}