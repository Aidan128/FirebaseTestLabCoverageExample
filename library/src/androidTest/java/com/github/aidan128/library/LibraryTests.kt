package com.github.aidan128.library

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class LibraryTests {
    @Test
    fun basicTests() {
        assertEquals(4, LibraryJavaClass().function1())
        assertEquals(4, LibraryKotlinClass().function1())
    }

    @Test
    fun basicTests2() {
        assertEquals(6, LibraryJavaClass().function2())
        assertEquals(6, LibraryKotlinClass().function2())
    }
}
