package algorithm

import algorithm.problemsolving.ProblemSolving
import algorithm.problemsolving.WhiteBoarding

fun main(){
    val a = arrayListOf(1, 2, 4, 5, 8, 9)
    val b = WhiteBoarding.bSearch(a, 9)
    val res2 = ProblemSolving.letterShiftingTwo("abC", 2)
    println(b)

}


