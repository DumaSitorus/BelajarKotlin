package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val digit = number.toString()

    var max = digit[0].digitToInt()
    var min = digit[0].digitToInt()

    for (i in 1 until digit.length) {
        val currentDigit = digit[i].digitToInt()
        if (currentDigit > max) {
            max = currentDigit
        }
        if (currentDigit < min) {
            min = currentDigit
        }
    }
    return max + min
}
