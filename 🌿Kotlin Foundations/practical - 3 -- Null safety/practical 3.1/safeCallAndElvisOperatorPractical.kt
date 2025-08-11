data class User(
	val id : Int? = null,
	val name : String? = null,
	val age : Int? = null,
	val profile : Profile? = null
)

data class Profile(
	val email : String? = null,
	val skills : List<String>? = null 
)


fun main() {
	val profile = Profile(email = "RajveerBiradar360@gmail.com", skills = listOf("Kotlin", "Coroutines", "Flow") );
	val user1 = User(id = 101, name  = "Rajveer", age = 20, profile = profile);

	val user2 = User(id = 102, age = 20,);

	val user1Name = user1?.name ?: "Name Missing"
	val user1Email = user1?.profile?.email ?: "email Missing"
	val user2Name = user2?.name ?: "Name Missing"
	val user2Email = user2?.profile?.email ?: "email Missing"
	
	println("user 1 Name = ${user1Name}")
	println("user 1 email = ${user1Email}")
	println("user 2 Name = ${user2Name}")
	println("user 2 email = ${user2Email}")
}