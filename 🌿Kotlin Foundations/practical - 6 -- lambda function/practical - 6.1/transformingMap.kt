fun main() {
	val numberMap : MutableMap<String,Int> = mutableMapOf(
		"value1" to 3,
		"value2" to 2,
		"value3" to 62,
		"value4" to 34,
		"value5" to 8,
		"value6" to 1,
		"value7" to 9,
		"value8" to 22,
		"value9" to 4,
		"value10" to 3
	)
	
	println(numberMap);

	numberMap.replaceAll { _ , values ->
		values * values		
	}
	
	println(numberMap);
}