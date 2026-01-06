data class UserDto(
    val name: String,
    val age: Int
)

val dto1 = UserDto("Subin", 26)
val dto2 = UserDto("Subin", 26)

println(dto1 == dto2)
println(dto1)

val olderDto = dto1.copy(age = 27)