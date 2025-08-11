data class ApiData(
	val name: String? = null,
	val id: Int? = null
)

fun main() {
	val apiData = ApiData(name = "Rajveer");
	if(apiData.name != null){
		println(apiData.name);
	}
	
	println(apiData.id + 4)
	
}