package com.github.julesssss.implementation

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ReverseStringTest {

    @Test
    fun withStack() {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val alphabetReversed = "zyxwvutsrqponmlkjihgfedcba"

        assertEquals(alphabetReversed, ReverseString(alphabet).withStack())
    }

    @Test
    fun withLoop() {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        val alphabetReversed = "zyxwvutsrqponmlkjihgfedcba"

        assertEquals(alphabetReversed, ReverseString(alphabet).withLoop())
    }
}