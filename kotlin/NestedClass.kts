class House(
    val address: String
) {
    // 바깥 클래스 참조 없음
    class LivingRoom(
        private val area: Double
    )

    // 바깥 클래스 참조 가짐(메모리 누수 위험)
    inner class Bedroom(
        private val area: Double
    ) {
        fun getAddress(): String {
            return this@House.address
        }
    }
}