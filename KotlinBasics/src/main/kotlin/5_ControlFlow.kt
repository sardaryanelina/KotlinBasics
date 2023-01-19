import java.util.*

// SECTION # 5
// CONTROL FLOW / CONDITIONALS

// if and when statements

// How do we define conditional logic in Kotlin? For this problem,
// we have two primary tools: if and when, both of which can be used as
// both a statement or an expression. An expression returns a values,
// whereas a statement does not.

fun main() {
    var someVariable = 100
// if statements can be written with or without curly braces.
// If we want to run multiple lines of code in response to some condition,
// curly braces can help us organize that code and make it more readable.

//And just like with the if condition, the else block can also be
// wrapped in curly braces to make it easier to read and to support adding
// more complex logic down the line.


    // If, if-else, else statements
    if (someVariable > 3) {
        println("The value was greater than 3")
    } else if (someVariable > 2) {
        println("The value was greater than 2")
    } else {
        println("Not greater")
    }

    val age: Int = 21
    if (age < 18) {
        println("You cannot register")
    } else if (age < 21) {
        println("You should be able to register")
    } else {
        println("You're good to go!")
    }

    // When statements
    var mode: Int = 2
    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is 2.")
            println("So, the mode is busy.")

        }
        3 -> println("The mode is super-productive.")
        else -> println("There is no such mode")


    }
    mode = 3
    val result = when (mode) {
        1 -> "The mode is lazy."
        2 -> {
            println("The mode is 2.")
            val i: Int = 8
            "So, the mode is busy."
        }
        3 -> "The mode is super-productive."
        else -> "There is no such mode"
    }

    println(result)

    /*
val random = Random().nextInt(50) + 1
IntelliJ helps you import the Random class from Java so that you can use it.
Don’t worry about the details of imports for now.
Now, use a when statement to switch between the cases where random is in the
range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40. In each case,
print out a message containing the range and the exact value of random.
Test your code in a main() function and run it several times to get different random numbers.
* */
    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("In 1 to 10: $random")
        in 11..20 -> println("In 11 to 20: $random")
        in 21..30 -> println("In 21 to 30: $random")
        in 31..40 -> println("In 31 to 40: $random")
        !in 1..50 -> println("Just for the sake of example") // this codeline will not work
        else -> println("Over 40: $random")
    }

    // When - Similar again to if else, we could wrap any of these code blocks
    // in curly braces if we needed more complex logic
    when {
        someVariable > 3 -> println("The value was greater than 3")
        someVariable > 2 -> println("The value was greater than 2")
        else -> println("Not greater")
//        else -> {
//            println("Not greater")
//        }
    }

// Why is this syntax useful? Well, in cases where we might be supplying
// multiple conditionals, all operating on a single variable, passing the variable into
// "when" allows us to implicitly reference the variable, saving us code.
    when (someVariable) {
        0, 1 -> println("The value was 0 or 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3")
        in 4..Int.MAX_VALUE -> println("The value was greater than 3")
    }
}