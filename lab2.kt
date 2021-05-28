//task1
fun sumDigUp(number: Int): Int = if (number != 0) number%10 + sumDigUp(number/10) else 0

//task2
fun sumDigDown(number: Int, curSum: Int): Int = if (number != 0) sumDigDown(number/10, curSum + number%10) else curSum

tailrec fun sumDigDownTail(number: Int, curSum: Int): Int = if (number != 0) sumDigDownTail(number/10, curSum + number%10) else curSum
