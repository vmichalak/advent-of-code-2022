package com.vmichalak.adc2022

/**
 * Advent of Code 2022 - Day 5
 * https://adventofcode.com/2022/day/5
 */
object Day05 {
    private data class Operation(val quantity: Int, val from: Int, val to: Int) {
        companion object {
            fun of(str: String) = str.split(' ').let { Operation(it[1].toInt(), it[3].toInt() - 1, it[5].toInt() - 1) }
        }
    }

    private fun parse(input: String): Pair<List<MutableList<Char>>, List<Operation>> = input
        .split("\n\n")
        .let { Pair(parseStacks(it[0]), parseOperations(it[1])) }

    private fun parseStacks(input: String): List<MutableList<Char>> {
        val inputLines = input.split('\n')
        val length = inputLines.last().length
        val lines = inputLines.dropLast(1)
        return (1..length step 4).map { x ->
            lines.filter { it.length > x }.map { it[x] }.filter { it != ' ' }.toMutableList()
        }
    }

    private fun parseOperations(input: String) = input.split('\n').map { line -> Operation.of(line) }

    private fun moveAll(stacks: List<MutableList<Char>>, operations: List<Operation>, reverse: Boolean = false) {
        operations.forEach { operation ->
            var popped = stacks[operation.from].take(operation.quantity)
            repeat(operation.quantity) { stacks[operation.from].removeFirst() }
            if(reverse) { popped = popped.asReversed() }
            stacks[operation.to].addAll(0, popped)
        }
    }

    private fun List<MutableList<Char>>.toTopString(): String = map { it.first() }.joinToString("")

    fun part1(input: String): String = parse(input).let { (stacks, operations) ->
        moveAll(stacks, operations, true)
        stacks.toTopString()
    }

    fun part2(input: String): String = parse(input).let { (stacks, operations) ->
        moveAll(stacks, operations)
        stacks.toTopString()
    }
}
