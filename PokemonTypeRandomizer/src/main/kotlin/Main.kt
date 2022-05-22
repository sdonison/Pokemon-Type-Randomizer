fun main() {
    val chooser : TypeChooser = TypeChooser()
    chooser.init()
    println("Welcome to the Pokemon Type Randomizer.")
    var loop = true;
    while (loop) {
        println("Please select which randomizer you would like to use. ")
        println("1. Choose one or two types for me.")
        println("2. Let me choose one or two type.")
        println("3. Quit")
        print("> ")
        var userInput: String = readLine()!!

        when (userInput) {
            "1" -> {
                println("How many types would you like chosen for you? Type 1 or 2")
                print("> ")
                var numberOfTypes: String = readLine()!!

                val pokemonList = chooser.randomTypes(numberOfTypes)
                println(pokemonList)
                /*if (numberOfTypes == "1") {
                    val type = typeList[0]
                    println("Your type is $type")
                }
                else if (numberOfTypes == "2") {
                    val type1 = typeList[0]
                    val type2 = typeList[1]
                    println("Your types are $type1 and $type2")
                }*/
                println("Would you like to run the program again? Type 1 for yes or 2 for no.")
                print("> ")
                var userContinue: String = readLine()!!
                when (userContinue) {
                    "1" -> {}
                    "2" -> {
                        println("Thank you for using the Pokemon Type Randomizer.")
                        loop = false
                    }
                }
            }
            "2" -> {
                println("How many types would you like to choose from? Type 1 or 2")
                print("> ")
                val numberOfTypes: String = readLine()!!
                val pokemonList = chooser.chooseTypes(numberOfTypes)
                println(pokemonList)
                println("Would you like to run the program again? Type 1 for yes or 2 for no.")
                print("> ")
                var userContinue: String = readLine()!!
                when (userContinue) {
                    "1" -> {}
                    "2" -> {
                        println("Thank you for using the Pokemon Type Randomizer.")
                        loop = false
                    }
                }
            }
            "3" -> {
                println("Thank you for using the Pokemon Type Randomizer.")
                loop = false
            }
        }
    }
}