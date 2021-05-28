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

//task5
fun operNumber2(number: Int, oper1: (Int, Int) -> Int, init: Int, oper2: (Int) -> Boolean): Int =
    if (number != 0)
        if(oper2(number%10))
            oper1(number%10, operNumber2(number/10, oper1, init, oper2))
        else operNumber2(number/10, oper1, init, oper2) * 10 + number%10
    else init

fun main() {
    //print(sumDigUp(1324))
    //print(sumDigDown(1324, 0))
    //print(sumDigDownTail(1534,0))
    //print(mulDigUp(333))
    //print(mulDigDown(333,1))
    //print(maxDigUp(1119))
    //print(maxDigDown(1119, 0))
    //print(operNumber(1119, {a, b -> a + b}, 0))
    
    //делит на 3 цифры делящиеся на 3
    //print(operNumber2(6655, {a, b -> b*10 + a/3}, 0, {a -> a%3 == 0}))
}
