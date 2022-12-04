package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day04Test {
    val input = File(this.javaClass.getResource("/day04.in")!!.toURI()).readLines()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(2, Day04.part1(listOf(
            "2-4,6-8",
            "2-3,4-5",
            "5-7,7-9",
            "2-8,3-7",
            "6-6,4-6",
            "2-6,4-8"
        )))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(567, Day04.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(4, Day04.part2(listOf(
            "2-4,6-8",
            "2-3,4-5",
            "5-7,7-9",
            "2-8,3-7",
            "6-6,4-6",
            "2-6,4-8"
        )))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(907, Day04.part2(input))
    }
}
