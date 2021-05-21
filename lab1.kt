fun main(){
    //task1
    print("Hello, world!")

    //task3
    val userName = readLine();
    println("Hello, $userName")

    //task5
    println("what is your favorite programming language?")
    when(readLine()){
        "Prolog", "Kotlin" -> println("Подлиза!")
        "C++" -> println("1")
        "C#" -> println("2")
        "Python" -> println("3")
    }
    
    //task6
    sumDit("4567")
}

fun sumDit(number :String){
    val arr = number.toList()
    val arrOfInt = arr.map{ it.toString().toInt() }

    print(arrOfInt.sum())
}
