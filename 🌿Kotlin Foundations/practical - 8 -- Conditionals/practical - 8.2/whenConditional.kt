fun main() {
	check("START");
	check("STOP");
	check("PAUSE");
}

fun check(input : String) {
	when(input) {
		"STOP" -> {println("it says stop")}
		"START" -> {println("it says to Start")}
		"PAUSE" -> {println("it says to pause")}
		else -> {println("it is not a proper command")}
	}
}