enum class Operation(val symbol : String) {
	ADD("+"),
	SUBTRACT("-"),
	MULTIPLY("X")
}

fun Calculator(value1 : Int, value2 : Int, operation : Operation){
	val result = when (operation){
		Operation.ADD -> (value1 + value2)
		Operation.SUBTRACT -> (value1 - value2)
		Operation.MULTIPLY -> (value1 * value2)
	}
	
	println("$value1 ${operation.symbol} $value2 = $result");
}

fun main() {
	Calculator(5,4,Operation.ADD);
	Calculator(5,4,Operation.SUBTRACT);
	Calculator(5,4,Operation.MULTIPLY);
}