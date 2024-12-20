package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    return when (args) {
        is Int -> "Yes! it's Integer"
        is Boolean -> "Yes! it's Boolean"
        is String -> "Yes! it's String"
        is Double -> "Yes! it's Double"
        is List<*> -> "Yes! it's List"
        is Map<*, *> -> "Yes! it's Map"
        else -> "Unknown type"
    }
}
