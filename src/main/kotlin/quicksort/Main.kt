package quicksort

import kotlin.system.measureTimeMillis


fun main() {
    val array = intArrayOf(57, 36, 4, 85, 19, 76, 6, 19, 56, 62)
    val largeArray = IntArray(1000) { (0..10000).random() }
    val sortedLargeArray = largeArray.copyOf()
    sortedLargeArray.sort()

    measureExecutionTime("Normal Quicksort of array of 10 elements") { quickSort(array = array) }
    measureExecutionTime("Normal Quicksort of array of 1000 elements") { quickSort(array = largeArray) }
    measureExecutionTime("Normal Quicksort of sorted array of 1000 elements") { quickSort(array = sortedLargeArray) }


    measureExecutionTime("Random Pivot Quicksort of array of 10 elements") { quickSort(array = array) }
    measureExecutionTime("Random Pivot Quicksort of array of 1000 elements") { quickSort(array = largeArray) }
    measureExecutionTime("Random Pivot Quicksort of sorted array of 1000 elements") { quickSort(array = sortedLargeArray) }
}

fun <T> measureExecutionTime(description: String, block: () -> T): T {
    var result: T
    val timeInMillis = measureTimeMillis {
        result = block()
    }
    println(description)
    println("Ausführungszeit: $timeInMillis ms")
    println()

    return result
}