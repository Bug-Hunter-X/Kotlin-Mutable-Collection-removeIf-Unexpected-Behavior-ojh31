fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val newList = list.filter { it % 2 != 0 }.toMutableList()
    println(newList) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }.toMutableMap()
    println(newMap) // Output: {a=1, c=3}
} 