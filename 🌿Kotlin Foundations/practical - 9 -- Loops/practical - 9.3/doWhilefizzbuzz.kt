
fun main() {
	var i = 1;
	do{
		when {
			i % 3 == 0 && i % 5 == 0 -> print("fizzbuzz ,");
			i % 3 == 0 -> print("fizz ,");
			i % 5 == 0 -> print("buzz ,");
			else -> print("$i ,");
		}
		i++;
	}while(i <= 100);
}