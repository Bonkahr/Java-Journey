fun isLeapYear(year: Int): Boolean {
    return when {
        year % 400 == 0 -> true
        year % 4 == 0 -> true
        year % 100 == 0 -> false
        else -> false
    }
}

fun main() {
    print(isLeapYear(2000))
}