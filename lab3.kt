//task1
fun inputArray(arr: Array<Int?>, size: Int): Array<Int?> =
    if (size != 0) {
        arr[size - 1] = readLine()?.toInt()
        inputArray(arr, size - 1)
    }
    else arr

fun outputArray(arr: Array<Int?>, size: Int): Unit? =
    if (size != 0){
        print("${arr[size - 1]}\t")
        outputArray(arr, size - 1)
    }
    else null

fun inputArray(): Array<Int?>? {
    println("Input size of array:")
    val size: Int? = readLine()?.toInt()

    println("Input array:")
    var arr: Array<Int?>? = size?.let { arrayOfNulls(it) }
    size?.let {
        if (arr != null) {
            val arr = inputArray(arr, it)
        }
    }

    if (arr != null && size != null)
        outputArray(arr, size)

    return arr
}

tailrec fun arrayOp(arr: Array<Int?>, lamda: (Array<Int>, Int) -> Int, init: Int = 0): Int? =
    if (arr.size != 0)
        lamda(arr[])


fun main() {
    inputArray()
}
