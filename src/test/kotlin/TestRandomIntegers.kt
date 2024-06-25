import kotlin.test.Test

class TestRandomIntegers {
    @Test
    fun testRandomIndexesReturnsCorrectValues() {
        val random = RandomIntegers()
        val result = random.randomIndexes(5, 10)
        assert(result.size == 5)
        assert(result.all { it in 0 until 10 })
    }
}