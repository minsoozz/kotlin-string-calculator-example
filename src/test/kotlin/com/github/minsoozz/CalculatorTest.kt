package com.github.minsoozz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun `입력받은 문자열을 입력값에 따라 계산한다`() {
        val calculator = Calculator()
        val input = "2 + 3 * 2 / 5"
        assertEquals(2, calculator.calculate(input).value)
    }
}