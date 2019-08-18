package com.github.julesssss.implementation

import java.util.*

class ReverseString(private val input: String) {

    fun withStack(): String {
        val stack = Stack<Char>()
        val sb = StringBuilder()

        for (c in input) {
            stack.push(c)
        }

        while (!stack.empty()) {
            sb.append(stack.pop())
        }
        return sb.toString()
    }

    fun withLoop(): String {
        val sb = StringBuilder()

        for (i in input.length - 1 downTo 0) {
            sb.append(input[i])
        }
        return sb.toString()
    }
}