package com.vmichalak.adc2022

object Day01 {
    fun part1(depth: List<Int>) = depth.zipWithNext().count { it.second > it.first }
    fun part2(depth: List<Int>) = depth.windowed(3) { it.sum() }.zipWithNext().count { it.second > it.first }
}