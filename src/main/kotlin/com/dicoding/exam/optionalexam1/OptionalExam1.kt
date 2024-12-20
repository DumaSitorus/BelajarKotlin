package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    require(numbers.size in 1..10)
    return numbers.sortedDescending().take(3).sum()
}
