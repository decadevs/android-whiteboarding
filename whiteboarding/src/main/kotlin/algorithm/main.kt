package algorithm


import algorithm.whiteboarding.WhiteBoardingWeekFour


fun main(){

    val a = intArrayOf(2, 3, 1, 5)
    val res = WhiteBoardingWeekFour.permutationArray(a)
    println(res)


}

fun <T> measureTimeMillis(function: () -> T): T {
    val startTime = System.currentTimeMillis()/1000.0
    println("startTime: 0:00")
    var result:T = function.invoke()
    var endTime = System.currentTimeMillis()/1000.0 - startTime
    println("endTime: ${endTime}")
    if (endTime > 0.006){
        throw Exception("RunTimeError")
    }
    else{
        return result
    }

}


