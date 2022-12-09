package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 8
 * https://adventofcode.com/2022/day/8
 */
object Day08 {
    private fun directions(input: List<String>, x: Int, y: Int) = listOf(
        (y - 1 downTo 0).map { x to it },
        (y + 1 until input[0].length).map { x to it },
        (x - 1 downTo 0).map { it to y },
        (x + 1 until input.size).map { it to y }
    )

    fun part1(input: List<String>): Int =input.indices.sumOf { i ->
        input[0].indices.count { j ->
            directions(input, i, j).any { trees ->
                trees.all { (x, y) -> input[x][y] < input[i][j] }
            }
        }
    }

    fun part2(input: List<String>): Int = input.indices.maxOf { i ->
        input[0].indices.maxOf { j ->
            directions(input, i, j).map { trees ->
                minOf(trees.takeWhile { (x, y) -> input[x][y] < input[i][j] }.size + 1, trees.size)
            }.reduce(Int::times)
        }
    }
}
