val score = 62
val grade = if (score > 70) "P" else "F"

val gradeText = when (score / 10) {
    10 -> "S"
    9 -> "A"
    8 -> "B"
    7 -> "C"
    else -> "D"
}