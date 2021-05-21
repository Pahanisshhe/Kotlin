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
}
