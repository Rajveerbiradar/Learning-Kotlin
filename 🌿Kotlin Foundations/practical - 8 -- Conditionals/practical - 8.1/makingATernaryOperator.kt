fun <T> ternary(condition: Boolean, ifTrue:T, ifFalse:T ) : T {
	return if(condition) ifTrue else ifFalse
}

fun main(){
	val result = ternary(("hello" is String), "it is string", "it is false")	
	println(result)
}