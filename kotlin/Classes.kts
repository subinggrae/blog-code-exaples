class Person(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 1 이상이어야 합니다.")
        }
    }

    val isAdult: Boolean
        get() = this.age >= 20
}

val person = Person("Subin", 26)
println(person.name)
person.age = 27
println(person.isAdult)