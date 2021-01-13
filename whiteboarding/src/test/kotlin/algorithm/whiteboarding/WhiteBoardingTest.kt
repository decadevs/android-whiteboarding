package algorithm.whiteboarding

import algorithm.problemsolving.ProblemSolving
import algorithm.problemsolving.WhiteBoarding
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class WhiteBoardingTest{
    @Test
    fun testToReturnCorrectIndexOfNumber(){
        val actual = 5
        val array = arrayListOf(1, 2, 4, 5, 8, 9)
        val expected = WhiteBoarding.bSearch(array, 9)
        assert(actual == expected)
    }
}