package com.github.minsoozz

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class NumberTest {
    @Test
    fun `입력값이 숫자가 아닐 경우 예외를 발생한다`() {
        assertThrows<IllegalArgumentException> {
            Number(" ")
        }
    }
}