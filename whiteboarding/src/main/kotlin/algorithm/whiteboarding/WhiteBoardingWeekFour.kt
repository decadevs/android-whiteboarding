package algorithm.whiteboarding

import algorithm.measureTimeMillis
import java.util.*

class WhiteBoardingWeekFour {

    companion object {
        fun cyclicRotation(A: IntArray, K: Int): IntArray {
            if (A.isEmpty()) {
                return A
            } else {
                var argArr = A.asList()
                var k = K
                val i = A.lastIndex
                while (k > 0) {
                    val arr = arrayListOf<Int>()
                    arr.add(argArr[i])
                    arr.addAll(argArr.subList(0, argArr.lastIndex))
                    argArr = arr
                    k--

                }
                return argArr.toIntArray()
            }

        }

        fun oddOccurrencesInArray(A: IntArray): Int {
            var arg = A.asList()
            val g = arg.groupBy { k ->
                k
            }.entries.filter { it.value.size % 2 != 0 }
            return if (g.isEmpty()) {
                0
            } else {
                g[0].key
            }
        }

        fun oddOccurrencesInArrayTwo(A: IntArray): Int {

            val h = hashMapOf<Int, Int>()
            for (i in A.indices) {
                if (!h.contains(A[i])) {
                    h[A[i]] = 1
                } else {
                    h[A[i]] = h[A[i]]?.plus(1)!!
                }
            }
            val g = h.entries.filter { it.value % 2 != 0 }
            return if (g.isEmpty()) {
                0
            } else {
                g[0].key
            }

        }

        fun frogJump(X: Int, Y: Int, D: Int): Int {
            var dist = Y - X
            var jump = dist / D
            if (dist % D != 0) {
                jump++
            }
            return jump
        }

        fun permutationArray(A: IntArray): Int {
            return measureTimeMillis{
                if (A.isEmpty()) return@measureTimeMillis 1
                var sumOfAllNumbers = 0
                for (num in A) sumOfAllNumbers += num
                val N = A.size.toLong()
                val expectedSumOfAllNumbers = (N + 1) * (N + 2) / 2

                val missingNumber = expectedSumOfAllNumbers - sumOfAllNumbers

                return@measureTimeMillis missingNumber.toInt()
            }



        }
    }
}
