class Hero private constructor(val name: String) {
    companion object Factory {
        fun newHero(name: String): Hero {
            return Hero(name)
        }
    }
}

val baby = Hero.newHero("Batman")