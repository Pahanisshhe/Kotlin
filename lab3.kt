//task1
fun inputArray(arr: Array<Int?>, length: Int): Array<Int?> =
    if (length != 0) {
        arr[length - 1] = readLine()?.toInt()
        inputArray(arr, length - 1)
    }
    else arr

fun outputArray(arr: Array<Int?>, length: Int): Unit? =
    if (length != 0){
        print("${arr[length - 1]}\t")
        outputArray(arr, length - 1)
    }
    else null

fun main() {

    val length: Int? = readLine()?.toInt()
    var arr: Array<Int?>? = length?.let { arrayOfNulls(it) }
    length?.let {
        if (arr != null) {
            val arr = inputArray(arr, it)
        }
    }

    if (arr != null) {
        if (length != null) {
            outputArray(arr, length)
        }
    }
}
