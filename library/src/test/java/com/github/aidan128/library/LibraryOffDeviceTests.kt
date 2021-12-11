package com.github.aidan128.library

import org.junit.Test

import org.junit.Assert.*

class LibraryOffDeviceTests {
    @Test
    fun basicTests3() {
        assertEquals(8, LibraryJavaClass().function3())
        assertEquals(8, LibraryKotlinClass().function3())
    }
}