fun checkString( input : Any? ){
	val data : String? = input as? String;
	if (data != null){
		println("${data} is a String")
	}else {
		println("${input} is not a string")
	}
}


fun main() {
	val someList : List<Any?> = listOf("apple", 3, 5, "Rajveer", "Goal");
	for (item in someList){
		checkString(item);
	}
}