enum class Country(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US");

    fun isKorea(): Boolean = (this == KOREA)
}

fun handleCountry(country: Country) {
    when(country) {
        Country.KOREA -> println("안녕하세요")
        Country.AMERICA -> println("Hello")
    }
}

handleCountry(Country.KOREA)