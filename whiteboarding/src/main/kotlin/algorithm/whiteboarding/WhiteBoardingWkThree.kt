package algorithm.whiteboarding

import java.util.*

class WhiteBoardingWkThree {
    companion object{

        fun solution(arr: List<Int>):List<Int>?{
            val result = ArrayList(Collections.nCopies(100, 0))
            for (value in arr) {
                result[value] = result[value] + 1
            }
            return result
        }
    }
}