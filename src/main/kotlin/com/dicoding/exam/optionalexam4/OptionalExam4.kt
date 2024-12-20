package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val median = string.length / 2

    return if (string.length % 2 == 0) {
        string[median - 1].toString() + string[median].toString()
    } else {
        string[median].toString()
    }
}
