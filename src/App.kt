fun main() {
    val lifespan = mutableMapOf(
        "cat" to 20,
        "human" to 75,
        "dog" to 13,
        "fish" to 4,
        "chimpanzee" to 35
    )

    lifespan["turtle"] = 85

    lifespan["human"] = 70
    lifespan.remove("cat")

    println(lifespan)
}