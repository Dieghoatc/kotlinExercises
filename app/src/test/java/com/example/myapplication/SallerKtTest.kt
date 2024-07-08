package com.example.myapplication

import calculateSalary
import org.junit.Test
import org.junit.Assert.*

class SallerKtTest() {

    @Test
    fun testCalculateSalaryCase1() {
        val sale = 400000f
        val commission = 0f
        val baseSalary = 1600000f
        val expectedCommission = 0.0f
        val expected = 1600000f

        val (commissionTotal, totalSalary) = calculateSalary(sale, commission, baseSalary)
        assertEquals(expectedCommission, commissionTotal )
        assertEquals(expected,totalSalary )
    }
    @Test
    fun testCalculateSalaryCase2() {
        val sale = 600000f
        val commission = 0.05f
        val baseSalary = 1600000f
        val expected = 1630000f
        val expectedCommission = 30000f

        val (commissionTotal, totalSalary) = calculateSalary(sale, commission, baseSalary)
        assertEquals(expectedCommission, commissionTotal )
        assertEquals(expected,totalSalary )
    }
    @Test
    fun testCalculateSalaryCase3() {
        val sale = 1400000f
        val commission = 0.10f
        val baseSalary = 1600000f
        val expected = 1740000f
        val expectedCommission = 140000f

        val (commissionTotal, totalSalary) = calculateSalary(sale, commission, baseSalary)
        assertEquals(expectedCommission, commissionTotal )
        assertEquals(expected,totalSalary )
    }
    @Test
    fun testCalculateSalaryCase4() {
        val sale = 1700000f
        val commission = 0.15f
        val baseSalary = 1600000f
        val expected = 1855000f
        val expectedCommission = 255000.02f

        val (commissionTotal, totalSalary) = calculateSalary(sale, commission, baseSalary)
        assertEquals(expectedCommission, commissionTotal )
        assertEquals(expected,totalSalary )
    }
    @Test
    fun testCalculateSalaryCase5() {
        val sale = 2500000f
        val commission = 0.20f
        val baseSalary = 1600000f
        val expected = 2100000f
        val expectedCommission = 500000f

        val (commissionTotal, totalSalary) = calculateSalary(sale, commission, baseSalary)
        assertEquals(expectedCommission, commissionTotal )
        assertEquals(expected,totalSalary )
    }
}