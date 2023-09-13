
fun getUserChoice (choose: Array<String>): String{
    var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice) {
        print("Please enter one of the following: ")
        for (things in choose) {
            print(things)
            print(" ")
        }
        println()
        val userInput = readlnOrNull()
        if (userInput != null && userInput in choose) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice

}