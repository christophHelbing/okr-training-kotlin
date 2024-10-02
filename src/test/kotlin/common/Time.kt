package common

import kotlin.system.measureTimeMillis

fun <T> measureExecutionTime(testname: String, block: () -> T): T {
    var result: T
    val timeInMillis = measureTimeMillis {
        result = block()
    }
    println("$testname Ausführungszeit: $timeInMillis ms")
    return result
}