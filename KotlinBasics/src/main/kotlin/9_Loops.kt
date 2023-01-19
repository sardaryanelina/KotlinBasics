// SECTION # 9
// LOOPS

fun main() {
    var counter = 0

    // Do-While Loop
    do {
        println(counter)
        counter += 1
    } while (counter < 5)

    // For loop
    for (i in 0 until 5) println(i) // 0 to 4, 5 not included
    for (i in 0..5) println(i) // 0 to 5, 5 included - inclusive on both sides
    for (i in 10 downTo 0) println(i) // count down - inclusive on both sides
    for (i in 10 downTo 0 step 3) println(i) // increment our counter by 3 // 10, 7, 4, 1


    for (i in 1..4) {
        println("No. $i")
    }

    // For(forEach) loop
    var list = listOf("Java", "C#", "PHP", "Kotlin", "Python")

    for (element in list) {
        println(element)
    }

    for ((index, value) in list.withIndex()) {
        println("Element at $index is $value.")
    }

    list.forEach { element -> println(element) }
    list.forEachIndexed { index, element -> println("$index: $element") }

    //  While loop
    var x = 5
    while (x >= 0) {
        println(x)
        x--
    }
}