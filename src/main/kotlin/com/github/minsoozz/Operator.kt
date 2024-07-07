package com.github.minsoozz

enum class Operator(
    val symbol: String,
    val operation: (Number, Number) -> Number
) {
    PLUS("+", { a, b -> Number(a.value + b.value) }),
    MINUS("-", { a, b -> Number(a.value - b.value) }),
    MULTIPLY("*", { a, b -> Number(a.value * b.value) }),
    DIVIDE("/", { a, b -> Number(a.value / b.value) });

    companion object {
        fun of(symbol: String): Operator =
            Operator.entries.find { it.symbol == symbol } ?: throw IllegalArgumentException()
    }
}