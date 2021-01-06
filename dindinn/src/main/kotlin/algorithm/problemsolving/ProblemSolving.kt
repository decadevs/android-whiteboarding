package algorithm.problemsolving

class ProblemSolving {

    companion object{
        fun letterShifting(str:String, shift:Int): String{
            val alphabets = "abcdefghijklmnopqrstuvwxyz"
            val length = alphabets.length
            val reg = "[a-zA-Z]+".toRegex() // Regex to string input
            when(reg.matches(str)){
                //when it is string
                true ->{
                    val d = str.map {
                        var sum = shift + alphabets.indexOf(it)
                        var g: Int //global reducer
                        while(sum > length){
                            g = sum - length
                            sum = 0 + g
                        }
                        if(!it.isLowerCase()){
                            alphabets[sum].toUpperCase()
                        }
                        else{
                            alphabets[sum]
                        }
                    }
                    return d.joinToString("")
                }
                else->{
                    //If not string input
                    throw Exception("Input must be character sequence only")
                }
            }
        }

        fun letterShiftingTwo(str:String, shift:Int):String{
            val z = 'z'.toInt() //Highest lower case value
            val zz = 'Z'.toInt() //Highest upper case value
            val reg = "[a-zA-Z]+".toRegex() // Regex to confirm string input
            when(reg.matches(str)){
                //when it is string
                true ->{
                    val g = str.fold("") { c, n ->
                        val case = n.isLowerCase()
                        var sum = (n + shift).toInt()
                        var g: Int //global reducer
                        when(case){
                            true -> {
                                while(sum > z){
                                    g = sum - z
                                    sum = 96 + g
                                }
                                c + sum.toChar()
                            }
                            else -> {
                                while(sum > zz){
                                    g = sum - zz
                                    sum = 64 + g
                                }
                                c + sum.toChar().toUpperCase()
                            }
                        }
                    }
                    return g
                }
                else->{
                    //If not string input
                    val e = Exception("Input must be character sequence only")
                    println(e.javaClass)
                    throw e
                }
            }

        }
    }

}