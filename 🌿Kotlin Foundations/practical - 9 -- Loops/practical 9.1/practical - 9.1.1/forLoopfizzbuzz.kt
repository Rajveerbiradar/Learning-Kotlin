fun main() {
	for(num in 1..100){
		when {
			num % 3 == 0 && num % 5 == 0 -> print("fizzbuzz ,")
			num % 3 == 0 -> print("fizz ,")
			num % 5 == 0 -> print("buzz ,")
			else -> print("$num ,")	
		}
	}
}