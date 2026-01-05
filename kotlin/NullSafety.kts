// null을 허용하지 않음
val fruit: String = "Apple"

// null을 허용
val fish: String? = null

// null이면 length()를 호출하지 않고 0을 반환
val fishNameLength = fish?.length ?: 0