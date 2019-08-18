package com.github.julesssss.implementation

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class TwoSum {

    fun with(nums: Array<Int>, target: Int): Array<Int> {
        val map = HashMap<Int, Int>()

        for (i in 0 until nums.size) {
            val remainder = target - nums[i]
            map[remainder] = i
        }

        for (i in 0 until nums.size) {
            if (map.containsKey(nums[i])) return arrayOf(i, map[nums[i]]!!)
        }

        return arrayOf(-1, -1)
    }
}