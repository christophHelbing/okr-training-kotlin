package quicksort

fun quickSortWithFixFirstElementPivot(array: IntArray): IntArray {
    return quickSort(array = array) { it[0] }
}

fun quickSortWithRandomizedPivot(array: IntArray): IntArray {
    return quickSort(array = array) { it[it.indices.random()] }
}

private fun quickSort(array: IntArray, getPivot: (IntArray) -> Int): IntArray {
    if (array.size < 2) return array

    val pivot = getPivot(array)

    var less = intArrayOf()
    var greater = intArrayOf()
    var equal = intArrayOf()

    array.forEach {
        if (it < pivot) {
            less = less.plus(it)
        } else if (it > pivot) {
            greater = greater.plus(it)
        } else {
            equal = equal.plus(it)
        }
    }
    return quickSort(less, getPivot) + equal + quickSort(greater, getPivot)
}