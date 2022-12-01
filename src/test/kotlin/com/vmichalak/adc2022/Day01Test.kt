package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import java.io.File
import kotlin.test.Test

class Day01Test {
    val input = File(this.javaClass.getResource("/day01.in")!!.toURI()).readText()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(24000, Day01.part1("""
            1000
            2000
            3000
            
            4000
            
            5000
            6000
            
            7000
            8000
            9000
            
            10000
        """.trimIndent()))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(71924, Day01.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(45000, Day01.part2("""
            1000
            2000
            3000
            
            4000
            
            5000
            6000
            
            7000
            8000
            9000
            
            10000
        """.trimIndent()))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(210406, Day01.part2(input))
    }
}