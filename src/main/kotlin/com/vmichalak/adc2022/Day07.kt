package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 7
 * https://adventofcode.com/2022/day/7
 */
object Day07 {
    private inline fun String.isTopPath() = this.isEmpty()
    private inline fun String.getParentPath() = this.substringBeforeLast('/', "")
    private inline fun <T> MutableMap<T, Int>.increment(key: T, value: Int) =
        put(key, getOrDefault(key, 0) + value)

    private fun cd(originPath: String, destinationPath: String): String = when(destinationPath) {
        "/" -> ""
        ".." -> originPath.getParentPath()
        else -> if(originPath.isTopPath()) { destinationPath } else { "$originPath/$destinationPath" }
    }

    private fun parse(input: List<String>) = buildMap<String, Int> {
        var pwd = ""
        input.forEach { line ->
            when {
                line.startsWith("$ cd ") -> pwd = cd(pwd, line.removePrefix("$ cd "))
                line[0].isDigit() -> {
                    val size = line.split(' ')[0].toInt()
                    var currentPath = pwd
                    increment(currentPath, size)
                    while (!currentPath.isTopPath()) {
                        currentPath = currentPath.getParentPath()
                        increment(currentPath, size)
                    }
                }
            }
        }
    }

    fun part1(input: List<String>): Int = parse(input).values.filter { it <= 100_000 }.sum()

    fun part2(input: List<String>): Int = parse(input).let{ sizes ->
        sizes.values.filter { 70_000_000 - (sizes[""]!! - it) >= 30_000_000 }.min()
    }
}
