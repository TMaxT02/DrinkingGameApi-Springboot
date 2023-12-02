package oliver.drinkTasks

fun main() {

        val drinkTasks = mutableListOf<String>(
                "take one shot", "give one shot to a person",
                "The person to your right has to drink", "let someone chose a drink for you",
                "spin on the wheel", "switch someones drink with yours",
                "the tallest has to drink", "the smallest has to drink"
        )

        val randomIndex = (0 until drinkTasks.size).random()

        val randomValue = drinkTasks[randomIndex]
        println("$randomValue")
}