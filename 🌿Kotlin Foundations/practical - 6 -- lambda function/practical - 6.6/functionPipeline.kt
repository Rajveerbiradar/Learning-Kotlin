fun reverse(input : String) : String {
	var n : Int = input.length - 1 ;
	var result : String? = "";
	for (i in input.indices){
		result += input[n];
		n--;
	}
	
	return result?: "Error"
}

fun uppercaseInput(input : String) : String {
	return input.uppercase()
}

fun addPrefix(input : String) : String {
	return "the ${input}"
}


fun main() {
	
	val revFunc = ::reverse
	val upCaseFunc = ::uppercaseInput
	val addPreFunc = ::addPrefix
	
	
	
	val name = "Rajveer";
	val result = addPreFunc(upCaseFunc(revFunc(name)));
	println("$name becomes : ${result}");
}