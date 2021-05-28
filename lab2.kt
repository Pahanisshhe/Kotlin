//task1
fun sumDigUp(number: Int): Int = if (number != 0) number%10 + sumDigUp(number/10) else 0

//task2
fun sumDigDown(number: Int, curSum: Int): Int = if (number != 0) sumDigDown(number/10, curSum + number%10) else curSum

tailrec fun sumDigDownTail(number: Int, curSum: Int): Int = if (number != 0) sumDigDownTail(number/10, curSum + number%10) else curSum

//task3
fun  mulDigUp(number: Int): Int = if (number != 0) number%10 * mulDigUp(number/10) else 1

tailrec fun mulDigDown(number: Int, curMul: Int): Int = if (number != 0) mulDigDown(number/10, number%10 * curMul) else curMul

fun maxDigUp(number: Int): Int =
    if (number != 0)
        if (number%10 > maxDigUp(number/10))
            number%10
        else
            maxDigUp((number/10))
    else 0

tailrec fun maxDigDown(number: Int, maxDig: Int): Int =
    if (number != 0)
        if (number%10 > maxDig)
            maxDigDown(number/10, number%10)
        else
            maxDigDown(number/10, maxDig)
    else maxDig

//task4
fun operNumber1(number: Int, oper: (Int, Int) -> Int, init: Int): Int =
    if (number != 0)
        oper(number%10, operNumber1(number/10, oper, init))
    else init
