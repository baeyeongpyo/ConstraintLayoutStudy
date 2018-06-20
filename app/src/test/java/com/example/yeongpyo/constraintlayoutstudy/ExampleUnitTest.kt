package com.example.yeongpyo.constraintlayoutstudy

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val map = HashMap<String, Int>().apply {
            "a" to 1
            "b" to 1
            "c" to 1
//            put("A", 1)
//            put("B", 2)
//            put("C", 3)
        }
        println(map.toList()[0].first)
        println(map.toList()[1])
    }
}
