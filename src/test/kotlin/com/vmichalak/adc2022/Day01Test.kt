package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import java.io.File
import kotlin.test.Test

class Day01Test {
    val input = File(this.javaClass.getResource("/day01.txt")!!.toURI()).readLines()

    @Test
    fun `Part1 Exemple`() {
        Assertions.assertEquals(7, Day01.part1(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
    }

    @Test
    fun `Part1 Solution`() {
        val i = input.map { it.toInt() }
        println(Day01.part1(i))
    }

    @Test
    fun `Part2 Exemple`() {
        Assertions.assertEquals(5, Day01.part2(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
    }

    @Test
    fun `Part2 Solution`() {
        val i = input.map { it.toInt() }
        Assertions.assertEquals(1538, Day01.part2(i))
    }
}