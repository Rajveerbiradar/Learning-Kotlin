fun checker(input : Any) {
	if(input is String && input.length > 5){
		println("It's a string with length > 5")
	}else if(input is Int && input in 1..100){
		println("It's a number in range")
	}else {
		println("your Input doesn't pass the test")
	}
}

fun main (){
	checker("hii")
	checker("Rajveer")
	checker(5)
	checker(111)
}