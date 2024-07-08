package com.example.myapplication
import iva
import org.junit.Assert.*
import org.junit.Test
import subTotal
import totalInvoice

class InvoiceKtTest {

    @Test
    fun testIva() {
        // value1 = 100
        // value2 = 200
        // value3 = 300
        // total = 600 * 19%
        val expected = 114.0f
        assertEquals(expected, iva(600f))
    }

    @Test
    fun testSubTotal(){
        val expected = 600.0f
        assertEquals(expected, subTotal(100f,200f,300f))
    }

    @Test
    fun testTotal() {
        val expected = 714.0f
        val subTotal = 600.0f
        val iva = 114f
        assertEquals(expected, totalInvoice(subTotal, iva))
    }
}