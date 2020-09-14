fun main(args: Array<String>){
        // Reverse String
    reverseString("This string is backwards.")

        // Highest Number in Array
    var numberArray: IntArray = intArrayOf(1, 5, 7, 10, 2, 5)
    highestNum(numberArray)

        // Savings Account
    var savings = SavingAccount(50)
    println(savings.deposit(350))
    println(savings.withdraw(200))

        // Current Account (with error if withdrawing puts current amount less than 100)
    var current = CurrentAccount(120)
    println(current.deposit(10))
    println(current.withdraw(10))
    println(current.withdraw(90))
}

fun reverseString(param: String){    var reverseString = ""
    for(i in param.length-1 downTo 0){
        reverseString += param[i]
    }
    println(reverseString)
}

fun highestNum(numberArray: IntArray){
    var max = 0
    for(i in numberArray){
        if(i > max)
            max = i
    }
    println(max)
}