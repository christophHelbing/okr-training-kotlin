package quicksort

import kotlin.system.measureTimeMillis


fun main() {
    val array = intArrayOf(57, 36, 4, 85, 19, 76, 6, 19, 56, 62)
    val largeArray = IntArray(1000) { (0..10000).random() }
    val sortedLargeArray = largeArray.copyOf()
    sortedLargeArray.sort()

    measureExecutionTime("Normal Quicksort of array of 10 elements") { quickSortWithFixFirstElementPivot(array = array) }
    measureExecutionTime("Normal Quicksort of array of 1000 elements") { quickSortWithFixFirstElementPivot(array = largeArray) }
    measureExecutionTime("Normal Quicksort of sorted array of 1000 elements") { quickSortWithFixFirstElementPivot(array = sortedLargeArray) }

    measureExecutionTime("Random Pivot Quicksort of array of 10 elements") { quickSortWithRandomizedPivot(array = array) }
    measureExecutionTime("Random Pivot Quicksort of array of 1000 elements") { quickSortWithRandomizedPivot(array = largeArray) }
    measureExecutionTime("Random Pivot Quicksort of sorted array of 1000 elements") { quickSortWithRandomizedPivot(array = sortedLargeArray) }

    measureExecutionTime("In Place Partition Quicksort of array of 10 elements") { quickSortInPlacePartition(array = array) }
    measureExecutionTime("In Place Partition Quicksort of array of 1000 elements") { quickSortInPlacePartition(array = largeArray) }
    measureExecutionTime("In Place Partition Quicksort of sorted array of 1000 elements") { quickSortInPlacePartition(array = sortedLargeArray) }
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