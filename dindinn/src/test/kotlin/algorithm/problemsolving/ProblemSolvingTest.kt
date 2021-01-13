package algorithm.problemsolving

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import java.lang.Exception


@RunWith(JUnit4::class)
internal class ProblemSolvingTest{

    @Test
    fun testLetterShiftingReturnsRightLetterAfterShifting(){
        val actual = "cde"
        val expected = ProblemSolving.letterShifting("abc", 2)
        assert(actual == expected)
    }
    @Test
    fun testLetterShiftingReturnsRightLetterAfterCyclicShifting(){
        val actual = "cde"
        val expected = ProblemSolving.letterShifting("abc", 28)
        assert(actual == expected)
    }
    @Test
    fun testLetterShiftingThrowsExceptionWhenInputIsNotString(){
        val input = "9cde"
        try {
            ProblemSolving.letterShifting(input, 2)
        }
        catch (e:Exception){
            assert(true)
        }

    }
    @Test
    fun testLetterShiftingThrowsExceptionWithErrorMessageWhenInputIsNotString(){
        val input = "9cde"
        try {
            ProblemSolving.letterShifting(input, 2)
        }
        catch (e:Exception){
           assert(e.message == "Input must be character sequence only")
        }

    }

}