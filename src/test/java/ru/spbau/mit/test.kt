package ru.spbau.mit
import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test
    fun testSolution0() {
        assertEquals("Yes", solution("-++-"))
    }

    @Test
    fun testSolution1() {
        assertEquals("No", solution("+-"))
    }

    @Test
    fun testSolution2() {
        assertEquals("Yes", solution("++"))
    }

    @Test
    fun testSolution3() {
        assertEquals("No", solution("-"))
    }
}
