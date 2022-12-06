package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 6
 * https://adventofcode.com/2022/day/6
 */
object Day06 {
    private fun Char.toArrayIndex() = this - 'a'

    private fun IntArray.getAndReplace(index: Int, value: Int): Int {
        val oldValue = this[index]
        this[index] = value
        return oldValue
    }

    private fun findMarker(content: String, markerSize: Int): Int {
        val indexArray = IntArray(26)
        var lastDuplicateIndex = 0
        return content.withIndex().indexOfFirst { c ->
            val lastIndex = indexArray.getAndReplace(c.value.toArrayIndex(), c.index)
            lastDuplicateIndex = lastDuplicateIndex.coerceAtLeast(lastIndex)
            c.index - lastDuplicateIndex >= markerSize
        } + 1
    }

    fun part1(input: String): Int = findMarker(input, 4)
    fun part2(input: String): Int = findMarker(input, 14)
}
