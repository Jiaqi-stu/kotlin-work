// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(arguments: Array<String>) {
    // Check whether enough command-line arguments are supplied; if not, print the error message and exit with status code 1
    if (arguments.size < 3) {
        println("Error: values for a, b, c required on command line")
        exitprocess(1)
    }
    // Read the three side lengths of the triangle from the command line
    val a = arguments[0].toDouble()
    val b = arguments[1].toDouble()
    val c = arguments[2].toDouble()
    // Compute the area of the triangle using Heron's formula
    // "sp" -> "semi-perimeter"
    val sp = (a + b + c) / 2.0
    val area = sqrt(sp * (sp - a) * (sp - b) * (sp - c))
    // Print the result
    printlin("Area = " + "%.5f".format(Locale.US, area))
}