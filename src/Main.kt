fun main() {
    println(wasScreenTimeHigherToday(300, 250))
    println(wasScreenTimeHigherToday(300, 300))
    println(wasScreenTimeHigherToday(200, 220))
}

fun wasScreenTimeHigherToday(
    timeSpentToday: Int,
    timeSpentYesterday: Int
): Boolean {
    return timeSpentToday > timeSpentYesterday
}