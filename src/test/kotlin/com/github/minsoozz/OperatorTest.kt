package com.github.minsoozz

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OperatorTest {
    @Test
    fun `입력값이 연산자 아닐 경우 예외를 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Operator.of(" ")
        }
    }
}