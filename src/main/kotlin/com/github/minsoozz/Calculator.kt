package com.github.minsoozz

private const val DELIMITER = " "

class Calculator {

    fun calculate(input: String): Number {
        val tokens = input.split(DELIMITER)
        var result = Number(tokens[0])

        var index = 1
        while (index < tokens.size) {
            val operator = Operator.of(tokens[index])
            val operand = Number(tokens[index + 1])
            result = operator.operation(result, operand)
            index += 2
        }
        return result
    }
}