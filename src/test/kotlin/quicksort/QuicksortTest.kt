package quicksort

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class QuicksortTest {
    @Test
    fun `sorting a random mixed int array with normal quick sort`() {
        val array = intArrayOf(57, 36, 4, 85, 19, 76, 6, 19, 56, 62)
        val expected = intArrayOf(4, 6, 19, 19, 36, 56, 57, 62, 76, 85)

        val result = quickSortWithFixFirstElementPivot(array = array)

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `sorting a random mixed large int array with normal quick sort`() {
        val largeArray = IntArray(1000) { (0..10000).random() }
        val expected = largeArray.copyOf()
        expected.sort()

        val result = quickSortWithFixFirstElementPivot(largeArray)

        assertThat(result).isEqualTo(expected)
    }
}