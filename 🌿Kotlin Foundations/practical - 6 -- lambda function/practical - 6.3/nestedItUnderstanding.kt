// understanding the nested it

fun main () {
	val charList : List<String> = listOf("a", "b", "c", "d", "E", "F");
	val newMap : List<String> = charList.map {
		it.uppercase().filter {it != 'C'};
	}
	println("the transformed list is ${newMap}");
}