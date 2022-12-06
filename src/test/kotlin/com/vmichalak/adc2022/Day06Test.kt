package com.vmichalak.adc2022

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

class Day06Test {
    val input = File(this.javaClass.getResource("/day06.in")!!.toURI()).readLines()[0]

    @Test
    fun `Part1 Example`() {
        Assertions.assertEquals(5,  Day06.part1("bvwbjplbgvbhsrlpgdmjqwftvncz"))
        Assertions.assertEquals(6,  Day06.part1("nppdvjthqldpwncqszvftbrmjlhg"))
        Assertions.assertEquals(10, Day06.part1("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"))
        Assertions.assertEquals(11, Day06.part1("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"))
    }

    @Test
    fun `Part1 Solution`() {
        Assertions.assertEquals(1134, Day06.part1(input))
    }

    @Test
    fun `Part2 Example`() {
        Assertions.assertEquals(19, Day06.part2("mjqjpqmgbljsphdztnvjfqwrcgsmlb"))
        Assertions.assertEquals(23, Day06.part2("bvwbjplbgvbhsrlpgdmjqwftvncz"))
        Assertions.assertEquals(23, Day06.part2("nppdvjthqldpwncqszvftbrmjlhg"))
        Assertions.assertEquals(29, Day06.part2("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"))
        Assertions.assertEquals(26, Day06.part2("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"))
    }

    @Test
    fun `Part2 Solution`() {
        Assertions.assertEquals(2263, Day06.part2(input))
    }
}
