package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day08Test {
    val input = File(this.javaClass.getResource("/day08.in")!!.toURI()).readLines()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(21, Day08.part1(
            """
                30373
                25512
                65332
                33549
                35390
            """.trimIndent().split('\n')
        ))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(1796, Day08.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(8, Day08.part2(
            """
                30373
                25512
                65332
                33549
                35390
            """.trimIndent().split('\n')
        ))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(288120, Day08.part2(input))
    }
}
