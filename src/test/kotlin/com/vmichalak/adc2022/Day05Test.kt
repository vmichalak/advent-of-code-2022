package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day05Test {
    val input = File(this.javaClass.getResource("/day05.in")!!.toURI()).readText()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals("CMZ", Day05.part1(
            """
                [D]    
            [N] [C]    
            [Z] [M] [P]
             1   2   3 
            
            move 1 from 2 to 1
            move 3 from 1 to 3
            move 2 from 2 to 1
            move 1 from 1 to 2
            """.trimIndent()
        ))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals("LJSVLTWQM", Day05.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals("MCD", Day05.part2(
            """
                [D]    
            [N] [C]    
            [Z] [M] [P]
             1   2   3 
            
            move 1 from 2 to 1
            move 3 from 1 to 3
            move 2 from 2 to 1
            move 1 from 1 to 2
            """.trimIndent()
        ))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals("BRQWDBBJM", Day05.part2(input))
    }
}
