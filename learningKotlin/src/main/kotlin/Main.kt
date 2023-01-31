const val PI = 3.14
var x = 1

fun increment(): Double {
    x += 1
    return x * PI
}

fun areaOfCircle(radius: Int): Double{
    return kotlin.math.PI * radius
}

fun main(args: Array<String>) {
    println(increment())
    println(increment())
    println(increment())
    println(increment())
    println(increment())

    println(areaOfCircle(45))
}