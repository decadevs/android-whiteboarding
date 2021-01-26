package algorithm.whiteboarding

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class WhiteBoardingTwoTest{
    @Test
    fun testToReturnCorrectIndexOfNumber(){
        val actual = 5
        val array = arrayListOf(1, 2, 4, 5, 8, 9)
        val expected = WhiteBoardingTwo.bSearch(array, 9)
        assert(actual == expected)
    }
}