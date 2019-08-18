package test

import main.com.github.julesssss.search.BinarySearch
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import test.data.sortedPetNames

class BinarySearchTest {

    @Test
    fun find() {
        assertEquals(74, BinarySearch(names = sortedPetNames).find("Rupert"))
    }
}