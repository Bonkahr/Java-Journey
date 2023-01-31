fun place(): String {
    var place  = "Mountain"

    place = if (place == "Mountain"){
        "Not Mountain"
    }
    else{
        "Mountain"
    }
    return place
}

fun main() {
    val dodo = place()
    print(dodo)
}

