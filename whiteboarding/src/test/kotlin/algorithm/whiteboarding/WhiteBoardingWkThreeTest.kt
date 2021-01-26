package algorithm.whiteboarding

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
internal class WhiteBoardingWkThreeTest{
//    @Test
//    fun testToReturnCorrectArray(){
//        val actual = intArrayOf(0, 3, 1, 1, 0)
//        val arr = intArrayOf(1, 1, 3, 2, 1)
//        val expected = WeekThreeArray.solution(arr).copyOfRange(0, arr.size)
//        assert(actual.contentEquals(expected))
//    }

    @Test
    fun testWhiteBoardingWkThree(){
        val actual = listOf(0, 3, 1, 1, 0)
        val arr = listOf(1, 1, 3, 2, 1)
        val expected = WhiteBoardingWkThree.solution(arr)?.subList(0, arr.size)
        assert(actual == expected)
    }
}