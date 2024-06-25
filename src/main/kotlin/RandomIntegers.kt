import kotlin.random.Random

class RandomIntegers {

    fun randomIndexes(n: Int, max: Int): ArrayList<Int> {
        val output: ArrayList<Int> = arrayListOf()
        val sourceRange = 0..max
        val sourceList: ArrayList<Int> = sourceRange.toCollection(ArrayList())
        while (output.size < n) {
            val index = Random.nextInt(0, sourceList.size)
            output.add(sourceList[index])
            sourceList.removeAt(index)
        }
        return output
    }
}