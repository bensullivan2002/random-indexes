class RandomIntegers {
    private val randomIndices: ArrayList<Int> = arrayListOf()
    fun randomIndexes(n: Int, max: Int): ArrayList<Int> {
        while (randomIndices.size < n){
            val newRandom: Int = (0..max).random()
            if (!randomIndices.contains(newRandom)) {
                randomIndices.add(newRandom)
            }
        }
        return randomIndices
    }
}