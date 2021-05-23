fun main() {
    //task1()
    //task3()
    //task5()
    //print(sumDig(45))
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
