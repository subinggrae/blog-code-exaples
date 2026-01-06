data class Fruit(val name: String, val price: Int)

// 람다 정의
val isApple: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

// 함수 호출
val fruits = listOf(Fruit("사과", 3000), Fruit("바나나", 4000), Fruit("포도", 5000))
val apples = fruits.filter { fruit -> fruit.name == "사과" }
println(apples)

// it 사용
val expensiveFruit = fruits
    .filter { it.price > 3000 }
    .map { it.name }
println(expensiveFruit)