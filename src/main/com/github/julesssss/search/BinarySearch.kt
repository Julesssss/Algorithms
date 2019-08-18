package main.com.github.julesssss.search

/**
 * Given a list of names, find the given name
 */
class BinarySearch(private val names: Array<String>) {

    fun find(name: String): Int {
        var lowerIndex = 0
        var upperIndex = names.size

        while (lowerIndex < upperIndex) {
            val middleIndex = (upperIndex + lowerIndex) / 2

            when {
                name == names[middleIndex] -> return middleIndex
                name < names[middleIndex] -> upperIndex = middleIndex - 1
                name > names[middleIndex] -> lowerIndex = middleIndex + 1
            }
        }
        throw Exception("$name not found!")
    }
}