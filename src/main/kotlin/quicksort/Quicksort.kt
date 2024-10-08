package quicksort

fun quickSort(array: IntArray): IntArray {
    if(array.size < 2) return array

    val pivot = array[0]

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
    return quickSort(less) + equal + quickSort(greater)
}

fun quickSortWithRandomizedPivot(array: IntArray): IntArray {
    if(array.size < 2) return array

    val pivot = array[array.indices.random()]

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
    return quickSortWithRandomizedPivot(less) + equal + quickSortWithRandomizedPivot(greater)
}