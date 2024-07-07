package com.github.minsoozz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {

    @Test
    fun `입력받은 문자열을 입력값에 따라 계산한다`() {
        val calculator = Calculator()
        val input = "2 + 3 * 2 / 5"
        assertEquals(2, calculator.calculate(input))
    }

    @Test
    fun `입력값이 숫자가 아닐 경우 예외를 발생한다`() {
        val calculator = Calculator()
        val input = "+ + 3 * 2 / 5"
        assertThrows<IllegalArgumentException> {
            calculator.calculate(input)
        }
    }

    @Test
    fun `입력값이 연산자 아닐 경우 예외를 발생한다`() {
        val calculator = Calculator()
        val input = "3 3 3 * 2 / 5"
        assertThrows<IllegalArgumentException> {
            calculator.calculate(input)
        }
    }
}