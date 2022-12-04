package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 4
 * https://adventofcode.com/2022/day/4
 */
object Day04 {
    private infix fun IntRange.fullyOverlap(other: IntRange) = first <= other.first && last >= other.last
    private infix fun IntRange.overlap(other: IntRange) = first <= other.last && other.first <= last

    private fun parse(input: List<String>) = input
        .map { it.split(',') }
        .map { Pair(it[0].toIntRange(), it[1].toIntRange()) }

    private fun String.toIntRange(): IntRange {
        val (first, last) = split('-')
        return (first.toInt()..last.toInt())
    }

    fun part1(input: List<String>): Int = parse(input)
        .count { (it.first fullyOverlap it.second) || (it.second fullyOverlap it.first) }

    fun part2(input: List<String>): Int = parse(input)
        .count { it.first overlap it.second }
}
