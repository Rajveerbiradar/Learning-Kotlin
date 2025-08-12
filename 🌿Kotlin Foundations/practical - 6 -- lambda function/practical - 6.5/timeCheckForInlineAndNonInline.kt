// understanding inline and non-inline functions 

import kotlin.system.measureTimeMillis;

inline fun doSomethingInline(value: Int, operation: (Int) -> Int): Int {
    return operation(value)
}

fun doSomething(value: Int, operation: (Int) -> Int): Int {
    return operation(value)
}

fun main() {
    val inlineTime = measureTimeMillis {
        repeat(1_000_000) {
            doSomethingInline(5) { it * 2 }
        }
    }
    val nonInlineTime = measureTimeMillis {
        repeat(1_000_000) {
            doSomething(5) { it * 2 }
        }
    }
    println("Inline time: $inlineTime ms")
    println("Non-inline time: $nonInlineTime ms")



    val nonInlineTime2 = measureTimeMillis {
        repeat(1_000_000) {
            doSomething(5) { it * 2 }
        }
    }

    val inlineTime2 = measureTimeMillis {
        repeat(1_000_000) {
            doSomethingInline(5) { it * 2 }
        }
    }

    println("Inline time: $inlineTime2 ms")
    println("Non-inline time: $nonInlineTime2 ms")
}