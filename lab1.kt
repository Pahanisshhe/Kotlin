fun main() {
    //task1()
    //task3()
    //task5()
    //print(sumDig(45))
    //print(maxDig(8654))
    //print(minDig(6574))
    //print(mulDig(55))
    //print(sumPrimDiv(30))
    //print(sumOddDig3(53455))
    //print(method3(14))
}

fun task1() = println("Hello, world!")

fun task3() = println("Hello, ${readLine()}!")

fun task5() =
    when(readLine()){
        "Prolog", "Kotlin" -> println("Подлиза!")
        else -> println("(¬‿¬)")
    }

//task6
fun sumDig(number: Int): Int = if (number == 0) 0 else sumDig(number/10) + number%10

//task7
fun maxDig(number: Int): Int {
    fun maxDig(number: Int, curMax: Int): Int =
        if (number != 0)
            if (number % 10 > curMax)
                maxDig(number / 10, number % 10)
            else
                maxDig(number / 10, curMax)
        else
            curMax
    return maxDig(number, 0)
}

fun minDig(number: Int): Int {
    fun minDig(number: Int, curMin: Int): Int =
        if (number != 0)
            if (number % 10 < curMin)
                minDig(number / 10, number % 10)
            else
                minDig(number / 10, curMin)
        else
            curMin
    return minDig(number, 9)
}

fun mulDig(number: Int): Int = if (number != 0) number%10 * mulDig(number/10) else 1

fun sumPrimDiv(number: Int): Int {
    fun primNum(number: Int, div: Int): Boolean =
        if(div <= number/2)
            if(number%div == 0)
                false
            else
                primNum(number, div+1)
        else
            true

    fun sumPrimDiv(number: Int, curDiv: Int): Int =
        if(curDiv <= number/2)
            if(number%curDiv == 0)
                if(primNum(curDiv, 2))
                    curDiv + sumPrimDiv(number, curDiv+1)
                else
                    sumPrimDiv(number, curDiv+1)
            else
                sumPrimDiv(number, curDiv+1)
        else
            0

    return sumPrimDiv(number, 2)
}

fun sumOddDig3(number: Int): Int =
    if (number != 0)
        if (number%10%2 != 0 && number%10 > 3)
            1 + sumOddDig3(number/10)
        else
            sumOddDig3(number/10)
    else 0

fun method3(number: Int): Int {
    fun method3(number: Int, curDiv: Int): Int =
        if (curDiv <= number/2)
            if (number%curDiv == 0)
                if (sumDig(curDiv) < sumDig(number))
                    curDiv * method3(number, curDiv+1)
                else
                    method3(number, curDiv+1)
            else
                method3(number, curDiv+1)
        else 1

    return method3(number, 2)
}
