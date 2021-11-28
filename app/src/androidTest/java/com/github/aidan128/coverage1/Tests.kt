package com.github.aidan128.coverage1

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class Tests {
    @Test
    fun basicTests() {
        assertEquals(4, JavaClass().function1())
        assertEquals(4, KotlinClass().function1())
    }
}