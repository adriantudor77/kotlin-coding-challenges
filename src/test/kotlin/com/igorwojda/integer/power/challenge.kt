package com.igorwojda.integer.power

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test
import kotlin.math.exp
import kotlin.math.pow
import kotlin.text.Typography.times



private fun power(base: Int, exponent: Int): Int {

    var listOfPowerBaseAndExponent = List(exponent) { base }
    return listOfPowerBaseAndExponent.reduce(Int::times)

    //1
    /* var value = 1
     var similar = base

     for (i in 1..exponent) {

         if (value == exponent) {
             return similar
         } else
             value++
             similar *= base
     }*/

}

private class Test {
    @Test
    fun `power 2^1 returns 2`() {
        power(2, 1) shouldBeEqualTo 2
    }

    @Test
    fun `power 2^2 returns 2`() {
        power(2, 2) shouldBeEqualTo 4
    }

    @Test
    fun `power 2^3 returns 8`() {
        power(2, 3) shouldBeEqualTo 8
    }

    @Test
    fun `power 3^4 returns 81`() {
        power(3, 4) shouldBeEqualTo 81
    }
}
