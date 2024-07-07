package com.github.minsoozz

data class Number(val value: Int) {
    constructor(stringValue: String) : this(
        stringValue.toIntOrNull() ?: throw IllegalArgumentException()
    )
}