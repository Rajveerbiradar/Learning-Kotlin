fun returnTypeChecking(theFunction: () -> Any?) {
	var returnItem = theFunction();
	when(returnItem){
		null -> println("the returned value is null");
		Unit -> println("the returned value is unit");
		else -> println("the returned value is some real value - ${returnItem}");
	}
}

fun stringReturn() : String {
	return "Hello Rajveer"
}

fun intReturn() : Int {
	return 4
}

fun unitReturn() : Unit {
	println("a function which return Unit")
}

fun nullReturn() : String? {
	return null;
}

fun main() {
	returnTypeChecking(::stringReturn);
	returnTypeChecking(::intReturn);
	returnTypeChecking(::unitReturn);
	returnTypeChecking(::nullReturn);
}