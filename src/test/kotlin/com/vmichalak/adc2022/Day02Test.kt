package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day02Test {
    val input = File(this.javaClass.getResource("/day02.in")!!.toURI()).readLines()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(15, Day02.part1(listOf(
            "A Y",
            "B X",
            "C Z"
        )))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(9241, Day02.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(12, Day02.part2(listOf(
            "A Y",
            "B X",
            "C Z"
        )))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(14610, Day02.part2(input))
    }
}