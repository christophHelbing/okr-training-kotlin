package quicksort

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.system.measureTimeMillis
import org.junit.jupiter.api.Test

class QuicksortTest {
    @Test
    fun `sorting a random mixed int array with normal quick sort`() {
        val array = intArrayOf(57, 36, 4, 85, 19, 76, 6, 19, 56, 62)
        val expected = intArrayOf(4, 6, 19, 19, 36, 56, 57, 62, 76, 85)

        val result = measureExecutionTime("Test 1") { quickSort(array = array) }

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `sorting a random mixed large int array with normal quick sort`() {
        val largeArray = IntArray(1000) { (0..10000).random() }
        val expected = largeArray.copyOf()
        expected.sort()

        val result = measureExecutionTime("Test 2") { quickSort(largeArray) }

        assertThat(result).isEqualTo(expected)
    }

    @Test
    fun `sorting a sorted large int array with normal quick sort`() {
        val largeArray = IntArray(1000) { (0..10000).random() }
        largeArray.sort()
        val expected = largeArray.copyOf()

        val result = measureExecutionTime("Test 3") { quickSort(largeArray) }

        assertThat(result).isEqualTo(expected)
    }

    private fun <T> measureExecutionTime(testname: String, block: () -> T): T {
        var result: T
        val timeInMillis = measureTimeMillis {
            result = block()
        }
        println("$testname Ausführungszeit: $timeInMillis ms")
        return result
    }
}