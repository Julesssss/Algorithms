package com.github.julesssss.implementation

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class TwoSumTest {

    @Test
    fun verify() {
        val nums = arrayOf(2, 7, 11, 15)
        val target = 9
        val result = arrayOf(0, 1)

        assertArrayEquals(result, TwoSum().with(nums, target))
    }
}