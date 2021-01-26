package algorithm.whiteboarding

import algorithm.measureTimeMillis
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
internal class WhiteBoardingWeekFourTest {

    @Test
    fun testWhiteBoardingWkFour(){
        val actual = 3
        val expected = measureTimeMillis {
            val X = 10
            val Y = 85
            val D = 30
            CyclicRotation.frogJump(X, Y, D)
        }

        assert(actual == expected)
    }
}