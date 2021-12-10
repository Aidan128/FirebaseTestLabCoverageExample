package com.github.aidan128.coverage1

import org.junit.Test

import org.junit.Assert.*

class OffDeviceTests {
    @Test
    fun basicTests3() {
        assertEquals(8, JavaClass().function3())
        assertEquals(8, KotlinClass().function3())
    }
}