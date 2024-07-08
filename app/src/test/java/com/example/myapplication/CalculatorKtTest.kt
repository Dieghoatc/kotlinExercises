package com.example.myapplication
import org.junit.Assert.*
import org.junit.Test

import addition
import division
import multiplication
import subtraction

class CalculatorKtTest {

    @Test
    fun testAddition() {
        val expected = "36.0"
        assertEquals(expected, addition(21f, 15f) )
    }
    @Test
    fun testSubtraction() {
        val expected = "6.0"
        assertEquals(expected, subtraction(21f, 15f) )
    }
    @Test
    fun testMultiplication() {
        val expected = "315.0"
        assertEquals(expected, multiplication(21f, 15f) )
    }
    @Test
    fun testDivision() {
        val expected = "1.4"
        assertEquals(expected, division(21f, 15) )

        val expectedCero = "No se puede dividir por cero"
        assertEquals(expectedCero, division(21f, 0))
    }
}