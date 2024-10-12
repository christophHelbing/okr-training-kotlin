package quicksort

fun quickSortInPlacePartition(array: IntArray, low: Int = 0, high: Int = array.size - 1): IntArray {
    if (low < high) {
        val pivotIndex = partition(array, low, high)
        quickSortInPlacePartition(array, low, pivotIndex - 1)
        quickSortInPlacePartition(array, pivotIndex + 1, high)
    }
    return array
}

fun partition(array: IntArray, low: Int, high: Int): Int {
    val pivot = array[high]
    var i = low

    for (j in low until high) {
        if (array[j] < pivot) {
            swap(array, i, j)
            i++
        }
    }
    swap(array, i, high)
    return i
}

fun swap(array: IntArray, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}
