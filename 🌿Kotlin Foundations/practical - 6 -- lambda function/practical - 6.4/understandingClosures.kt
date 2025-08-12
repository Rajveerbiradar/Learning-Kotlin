// understanding the closures.

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

fun main() {
	val theCounter : () -> Int = counter();
	println(theCounter())
	println(theCounter())
}



fun counter() : () -> Int {
	var count : Int = 0;
	return {
		count++;
		count;
	}
}