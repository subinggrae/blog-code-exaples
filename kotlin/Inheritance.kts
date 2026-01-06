open class Animal(
    protected val species: String
) {
    open fun move() {
        println("이동합니다.")
    }
}

class Penguin(species: String): Animal(species) {
    private val wingCount = 2

    override fun move() {
        println("펭귄이 움직입니다.")
    }
}