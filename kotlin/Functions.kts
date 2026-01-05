// 함수 정의
fun feed(animal: String, message: String = "It feeds the"): String {
    return "$message $animal."
}

// 함수 호출
print(feed("cat"))