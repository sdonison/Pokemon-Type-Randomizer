import java.io.BufferedReader
import java.nio.file.Paths

class TypeChooser {

    val numberOfTypes: String = ""
    var type1: String = ""
    var type2: String = ""
    var count: Int = 0
    val totalPokemon: Int = 0
    private val pokemonTypes: List<String> = listOf("Normal", "Fighting", "Flying", "Poison", "Ground", "Rock", "Bug", "Ghost", "Steel", "Fire", "Water", "Grass", "Electric", "Psychic", "Ice", "Dragon", "Dark", "Fairy")
    //This data class is used to create a list that will be put into a mutable map
    data class Pokemon (
        val typeOne: String,
        val typeTwo: String,
        val game: String
            ) {
        companion object
    }

    val allPokemon = mutableMapOf<String, Pokemon>()

    fun init() {
        //This manually writes every Pokemon to the mutable map and associates each with a list created by the data class
        allPokemon["Serperior"] = Pokemon("Grass", "---", "BW")
        allPokemon["Emboar"] = Pokemon("Fire", "Fighting", "BW")
        allPokemon["Samurott"] = Pokemon("Water", "---", "BW")
        allPokemon["Watchog"] = Pokemon("Normal", "---", "BW")
        allPokemon["Stoutland"] = Pokemon("Normal", "---", "BW")
        allPokemon["Liepard"] = Pokemon("Dark", "---", "BW")
        allPokemon["Simisage"] = Pokemon("Grass", "---", "BW")
        allPokemon["Simisear"] = Pokemon("Fire", "---", "BW")
        allPokemon["Simipour"] = Pokemon("Water", "---", "BW")
        allPokemon["Musharna"] = Pokemon("Psychic", "---", "BW")
        allPokemon["Unfezant"] = Pokemon("Normal", "Flying", "BW")
        allPokemon["Zebstrika"] = Pokemon("Electric", "---", "BW")
        allPokemon["Gigalith"] = Pokemon("Rock", "---", "BW")
        allPokemon["Swoobat"] = Pokemon("Psychic", "Flying", "BW")
        allPokemon["Excadrill"] = Pokemon("Ground", "Steel", "BW")
        allPokemon["Audino"] = Pokemon("Normal", "---", "BW")
        allPokemon["Conkeldurr"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Seismitoad"] = Pokemon("Water", "Ground", "BW")
        allPokemon["Throh"] = Pokemon("Fighting", "---","BW")
        allPokemon["Sawk"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Leavaanny"] = Pokemon("Bug", "Grass", "BW")
        allPokemon["Scolipede"] = Pokemon("Bug", "Poison", "BW")
        allPokemon["Whimsicott"] = Pokemon("Grass", "---", "B")
        allPokemon["Lilligant"] = Pokemon("Grass", "---", "W")
        allPokemon["Basculin"] = Pokemon("Water", "---", "BW")
        allPokemon["Krookodile"] = Pokemon("Ground", "Dark", "BW")
        allPokemon["Darmanitan"] = Pokemon("Fire", "---", "BW")
        allPokemon["Maractus"] = Pokemon("Grass", "---", "BW")
        allPokemon["Crustle"] = Pokemon("Bug", "Rock", "BW")
        allPokemon["Scrafty"] = Pokemon("Dark","Fighting", "BW")
        allPokemon["Sigilyph"] = Pokemon("Psychic", "Flying", "BW")
        allPokemon["Cofagrigus"] = Pokemon("Ghost", "---", "BW")
        allPokemon["Carracosta"] = Pokemon("Water", "Rock", "BW")
        allPokemon["Archeops"] = Pokemon("Rock", "Flying", "BW")
        allPokemon["Garbodor"] = Pokemon("Poison", "---","BW")
        allPokemon["Zoroark"] = Pokemon("Dark", "---", "BW")
        allPokemon["Cinccino"] = Pokemon("Normal", "---", "BW")
        allPokemon["Gothitelle"] = Pokemon("Psychic", "---", "B")
        allPokemon["Reuniclus"] = Pokemon("Psychic", "---", "W")
        allPokemon["Swanna"] = Pokemon("Water", "Flying", "BW")
        allPokemon["Vanilluxe"] = Pokemon("Ice", "---", "BW")
        allPokemon["Sawsbuck"] = Pokemon("Normal", "Grass","BW")
        allPokemon["Emolga"] = Pokemon("Electric", "Flying","BW")
        allPokemon["Escavalier"] = Pokemon("Bug", "Steel","BW")
        allPokemon["Amoonguss"] = Pokemon("Grass", "Poison", "BW")
        allPokemon["Jellicent"] = Pokemon("Water", "Ghost", "BW")
        allPokemon["Alomomola"] = Pokemon("Water", "---", "BW")
        allPokemon["Galvantula"] = Pokemon("Bug", "Electric", "BW")
        allPokemon["Ferrothorn"] = Pokemon("Grass", "Steel", "BW")
        allPokemon["Klinklang"] = Pokemon("Steel", "---", "BW")
        allPokemon["Eelektross"] = Pokemon("Electric", "---", "BW")
        allPokemon["Beheeyem"] = Pokemon("Psychic", "---", "BW")
        allPokemon["Chandelure"] = Pokemon("Ghost", "Fire", "BW")
        allPokemon["Haxorus"] = Pokemon("Dragon", "---", "BW")
        allPokemon["Beartic"] = Pokemon("Ice", "---", "BW")
        allPokemon["Cryogonal"] = Pokemon("Ice", "---", "BW")
        allPokemon["Accelgor"] = Pokemon("Bug", "---", "BW")
        allPokemon["Stunfisk"] = Pokemon("Ground", "Electric", "BW")
        allPokemon["Mienshao"] = Pokemon("Fighting", "---", "BW")
        allPokemon["Druddigon"] = Pokemon("Dragon", "---", "BW")
        allPokemon["Golurk"] = Pokemon("Ground", "Ghost", "BW")
        allPokemon["Bisharp"] = Pokemon("Dark", "Steel", "BW")
        allPokemon["Bouffalant"] = Pokemon("Normal", "---", "BW")
        allPokemon["Braviary"] = Pokemon("Normal", "Flying", "W")
        allPokemon["Mandibuzz"] = Pokemon("Dark", "Flying", "B")
        allPokemon["Heatmor"] = Pokemon("Fire", "---", "BW")
        allPokemon["Durant"] = Pokemon("Bug", "Steel", "BW")
        allPokemon["Hydreigon"] = Pokemon("Dark", "Dragon", "BW")
        allPokemon["Volcarona"] = Pokemon("Bug", "Fire","BW")
        allPokemon["Cobalion"] = Pokemon("Steel", "Fighting", "BW")
        allPokemon["Terrakion"] = Pokemon("Rock", "Fighting", "BW")
        allPokemon["Virizion"] = Pokemon("Grass", "Fighting", "BW")
        allPokemon["Tornadus"] = Pokemon("Flying", "---", "BW")
        allPokemon["Thundurus"] = Pokemon("Electric", "Flying", "BW")
        allPokemon["Reshiram"] = Pokemon("Dragon", "Fire", "W")
        allPokemon["Zekrom"] = Pokemon("Dragon", "Electric", "B")
        allPokemon["Landorus"] = Pokemon("Ground", "Flying","BW")
        allPokemon["Kyurem"] = Pokemon("Dragon", "Ice", "BW")
    }
    //val bufferedReader = BufferedReader(Paths.get("black_white_pokedex.csv"))

    fun randomTypes(numberOfTypes: String): Map<String, Pokemon> {
        //Create a mutable list that will be used to return the types
        val typeList : MutableList<String> = mutableListOf()
        //Create a variable that rolls a random number that corresponds to one of the 18 types.
        val random = (0..17).random()
        var random2 = 18
        //If the user select two types, a second number will be generated.
        if (numberOfTypes == "2") {
            var rollType2: Boolean = true
            while (rollType2) {
                random2 = (0..17).random()
                print(random2)
                if (random == random2) {
                    random2 = (0..17).random()
                }
                //This is to make sure that the two random numbers are different. If this code is actually not needed, I may
                //remove it in a later version.
                else if (random != random2) {
                    rollType2 = false
                }
            }
        }
        type1 = pokemonTypes[random]
        if (numberOfTypes == "1") {
            println("Your type is $type1.")
        }
        if (numberOfTypes == "2") {
            type2 = pokemonTypes[random2]
            println("Your types are $type1 and $type2.")
            //This was used to test if the random types were being rolled and recorded correctly.
            /*typeList.add(type1)
            typeList.add(type2)
            return typeList*/
        }
        var filteredMap = mapOf<String, Pokemon>()
        if (numberOfTypes == "1") {
            filteredMap = allPokemon.filterValues { it.typeOne == type1 || it.typeTwo == type1}
        }
        else if (numberOfTypes == "2") {
            filteredMap = allPokemon.filterValues { it.typeOne  == type1 || it.typeTwo == type1 && it.typeOne == type2 || it.typeTwo == type2}
        }
        return filteredMap
    }

    fun chooseTypes(numberOfTypes: String): Map<String, Pokemon>{
        var chosenType1 = ""
        var chosenType2 = ""
        if (numberOfTypes == "1") {
            println("Please select your Pokemon type. Please write the Pokemon type exactly as it appears.")
            println("Here are the types to choose from: Normal      Fighting        Flying      Poison      Ground")
            println("Rock       Bug         Ghost       Steel       Fire        Water       Grass       Electric")
            println("Psychic        Ice         Dragon          Dark        Fairy")
            print("> ")
            chosenType1 = readLine()!!
        }
        else if (numberOfTypes == "2") {
            println("Please select your Pokemon types. Please write the Pokemon types exactly as it appears.")
            println("Here are the types to choose from: Normal      Fighting        Flying      Poison      Ground")
            println("Rock       Bug         Ghost       Steel       Fire        Water       Grass       Electric")
            println("Psychic        Ice         Dragon          Dark        Fairy")
            print("Enter your first type> ")
            chosenType1 = readLine()!!
            print("Enter your second type> ")
            chosenType2 = readLine()!!
        }
        var filteredMap = mapOf<String, Pokemon>()
        if (numberOfTypes == "1") {
            filteredMap = allPokemon.filterValues { it.typeOne == chosenType1 || it.typeTwo == chosenType1}
        }
        else if (numberOfTypes == "2") {
        }
        return filteredMap
    }
}
//did two random types after iterating it twice, got psychic and dark, showed all dark but krookodile (potentially because dark was second type) and showed no psychic pokemon
//ran the same test using two choosen types for dark and psychic, had the same issues
//tried same test but changed it to psychic first. This time it failed to show any dark pokemon except Krookodile, but it obtained all the psychic types.

//this seems to mean that the first two failed because it is searching for the second type in the second slot only (for dark psychic, no pokemon has psychic as its second type) and