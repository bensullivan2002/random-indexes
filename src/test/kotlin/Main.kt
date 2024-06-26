import kotlin.time.measureTime

fun main() {
    val randomIntegers = RandomIntegers()
    println("Time taken: ${measureTime { randomIntegers.randomIndexes(1, 1) }}")
}