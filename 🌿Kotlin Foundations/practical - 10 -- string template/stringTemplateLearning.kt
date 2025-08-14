fun resultString(name : String, marks : Int, rank : Int) : String{
	return when(rank){
		1 -> "$name scored  $marks out of 600 and ranked ${rank}st out of 100 "
		2 -> "$name scored  $marks out of 600 and ranked ${rank}nd out of 100 "
		3 -> "$name scored  $marks out of 600 and ranked ${rank}rd out of 100 "
		else -> "$name scored  $marks out of 600 and ranked ${rank}th out of 100 "
	}
}

fun main(){
	println(resultString("Rajveer", 560, 1));
	println(resultString("Raj", 480, 3));
	println(resultString("shreya", 300, 50));
}