package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val regex = "\\d+".toRegex()
    val findIntInStr = regex.find(str)

    return if (findIntInStr == null) {
        str + int.toString()
    } else {
        val IntInString = findIntInStr.value.toInt()
        val multiplyInt = IntInString * int
        val stringPart = str.substring(0, findIntInStr.range.first)
        stringPart + multiplyInt
    }
}
