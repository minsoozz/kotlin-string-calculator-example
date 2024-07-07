package com.github.minsoozz

data class Number(val value: Int) {
    constructor(str: String) : this(
        str.toIntOrNull() ?: throw IllegalArgumentException()
    )
}