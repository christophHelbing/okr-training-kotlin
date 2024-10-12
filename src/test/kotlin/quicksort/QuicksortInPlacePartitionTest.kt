package quicksort

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class QuicksortInPlacePartitionTest {
    @Test
    fun `sorting a random mixed int array with in place partition quick sort`() {
        val array = intArrayOf(4, 6, 19, 19, 36, 56, 57, 62, 76, 85)
        val expected = intArrayOf(4, 6, 19, 19, 36, 56, 57, 62, 76, 85)

        val result = quickSortInPlacePartition(array = array)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `sorting a random mixed large int array with in place partition quick sort`() {
        val largeArray = IntArray(1000) { (0..10000).random() }
        val expected = largeArray.copyOf()
        expected.sort()

        val result = quickSortInPlacePartition(largeArray)

        assertThat(result).isEqualTo(expected)
    }
}