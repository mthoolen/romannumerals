package nl.codesquad.kata

class RomanNumerals {
    private val numberToRoman = mapOf(
        1 to "I",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L",
        90 to "XC",
        100 to "C",
        400 to "CD",
        500 to "D",
        900 to "CM",
        1000 to "M"
    )

    fun convert(number: Int): String {
        numberToRoman[number]?.let { return it }
        val lastKey = numberToRoman.filter { it.key < number }.keys.last()
        return numberToRoman[lastKey] + convert(number - lastKey)
    }
}