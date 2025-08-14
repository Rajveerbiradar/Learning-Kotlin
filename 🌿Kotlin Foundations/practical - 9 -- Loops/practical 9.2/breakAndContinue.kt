//break and continue statement

fun main() {
	var primeCount : Int = 0;
	outer@ for (i in 2..1000){     // not starting from checking 1 as a prime number - as 1 is not consider as a prime number in mathematics.
		inner@ for (n in 2..(i-1)){
			if (i % n == 0){
				continue@outer ;
			}			
		}
		primeCount++;
		when(primeCount){
			1 -> println("${primeCount}st prime number is $i");
			2 -> println("${primeCount}nd prime number is $i");
			3 -> println("${primeCount}rd prime number is $i");
			else -> println("${primeCount}th prime number is $i");
		}
		if(primeCount == 5){ break@outer }
	}
}