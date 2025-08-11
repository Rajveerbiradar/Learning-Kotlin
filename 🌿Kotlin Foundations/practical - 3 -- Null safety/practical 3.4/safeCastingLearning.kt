data class ApiData(
	var data : Any? = null,
	var name : Any? = null
)

fun main() {
	var apiData : ApiData = ApiData(data = 125639, name = "Rajveer")
	
	var apiData_data = apiData.data as? String;
	var apiData_name = apiData.name as? String;
	println("the data taken from the api for ${apiData_name} is ${apiData_data}")

}