package com.github.minsoozz

class MainClass

fun main(args: Array<String>) {
    val console = Console()
    val calculator = Calculator()
    val input = console.input()
    val result = calculator.calculate(input)
    console.output(result)
}
