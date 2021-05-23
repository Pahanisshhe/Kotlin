fun main() {
    //task1()
    //task3()
    //task5()
    //print(sumDig(45))
    //print(maxDig(8654))
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
