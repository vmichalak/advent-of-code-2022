package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day03Test {
    val input = File(this.javaClass.getResource("/day03.in")!!.toURI()).readLines()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(157, Day03.part1(listOf(
            "vJrwpWtwJgWrhcsFMMfFFhFp",
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
            "PmmdzqPrVvPwwTWBwg",
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
            "ttgJtRGJQctTZtZT",
            "CrZsJsPPZsGzwwsLwLmpwMDw"
        )))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(7872, Day03.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(70, Day03.part2(listOf(
            "vJrwpWtwJgWrhcsFMMfFFhFp",
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
            "PmmdzqPrVvPwwTWBwg",
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
            "ttgJtRGJQctTZtZT",
            "CrZsJsPPZsGzwwsLwLmpwMDw"
        )))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(2497, Day03.part2(input))
    }
}