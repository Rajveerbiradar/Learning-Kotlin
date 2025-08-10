fun arrangeData(anyList : List<Any>) : Unit {
	var stringList : MutableList<String> = mutableListOf();
	var integerList : MutableList<Int> = mutableListOf();
	var doubleList : MutableList<Double> = mutableListOf();
	var booleanList : MutableList<Boolean> = mutableListOf();
	var charList : MutableList<Char> = mutableListOf();
	var longList : MutableList<Long> = mutableListOf();
	var floatList : MutableList<Float> = mutableListOf();

	for (item in anyList) {
		when(item){
			is String -> stringList.add(item);
			is Int -> integerList.add(item);
			is Double -> doubleList.add(item);
			is Boolean -> booleanList.add(item);
			is Char -> charList.add(item);
			is Long -> longList.add(item);
			is Float -> floatList.add(item);
			else -> ("list for ${item}'s data type doesn't exist")
		}		
	}
	println("the string value's extracted was ${stringList}");
	println("the Integer value's extracted was ${integerList}");
	println("the Double value's extracted was ${doubleList}");
	println("the Boolean value's extracted was ${booleanList}");
	println("the Character value's extracted was ${charList}");
	println("the Long vale's extracted was ${longList}");
	println("the Float value's extracted was ${floatList}");
}

fun main() {
	val theList : List<Any> = listOf("hello",4,true,"Okay",3,false,'a','b','z',false,3.14,2.16f,"Rajveer","Amchi Local",96,6.933f,123456789112233L);
	arrangeData(theList);
}