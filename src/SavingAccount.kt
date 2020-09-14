class SavingAccount(money: Int) {

    private var savingAmount = money

    fun withdraw(amount: Int): Int{
        return savingAmount - amount
    }

    fun deposit(amount: Int): Int{
        return savingAmount + amount
    }
}