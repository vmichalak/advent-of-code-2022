package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day07Test {
    val input = File(this.javaClass.getResource("/day07.in")!!.toURI()).readLines()

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(95437, Day07.part1(
            """
                $ cd /
                $ ls
                dir a
                14848514 b.txt
                8504156 c.dat
                dir d
                $ cd a
                $ ls
                dir e
                29116 f
                2557 g
                62596 h.lst
                $ cd e
                $ ls
                584 i
                $ cd ..
                $ cd ..
                $ cd d
                $ ls
                4060174 j
                8033020 d.log
                5626152 d.ext
                7214296 k 
            """.trimIndent().split('\n')
        ))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(1454188, Day07.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(24933642, Day07.part2(
            """
                $ cd /
                $ ls
                dir a
                14848514 b.txt
                8504156 c.dat
                dir d
                $ cd a
                $ ls
                dir e
                29116 f
                2557 g
                62596 h.lst
                $ cd e
                $ ls
                584 i
                $ cd ..
                $ cd ..
                $ cd d
                $ ls
                4060174 j
                8033020 d.log
                5626152 d.ext
                7214296 k 
            """.trimIndent().split('\n')
        ))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(4183246, Day07.part2(input))
    }
}
