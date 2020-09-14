class CurrentAccount(money: Int) {

    private var currentAmount = money

    fun withdraw(amount: Int): Int?{
        var checkAmount = currentAmount - amount
        if(checkAmount < 100){
            println("Insufficient funds.")
            return null
        } else {
            currentAmount = checkAmount
            return currentAmount
        }
    }

    fun deposit(amount: Int): Int{
        return currentAmount + amount
    }
}