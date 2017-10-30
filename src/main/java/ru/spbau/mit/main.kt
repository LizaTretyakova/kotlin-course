package ru.spbau.mit

const val YES: String = "Yes"
const val NO: String = "No"

fun solution(wires: String): String {
    val inters = mutableListOf<Char>()

    for (w in wires) {
        if (inters.lastOrNull() == w) {
            inters.removeAt(inters.lastIndex)
        } else {
            inters.add(w)
        }
    }

    if (inters.isEmpty()) {
        return YES
    }
    return NO
}

fun main(args: Array<String>) {
    val input = readLine()
    println(solution(input!!))
}
