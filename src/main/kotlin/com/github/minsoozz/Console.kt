package com.github.minsoozz

import java.util.Scanner

class Console {

    fun input(): String {
        val scanner = Scanner(System.`in`)
        return scanner.nextLine()
    }

    fun output(result: Number) {
        println("result = $result")
    }
}

