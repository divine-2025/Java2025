package Aug12;

public class BankAccount  {
    private static double amount =1000;
    public double balance ( ){

        return amount;

    }

    public double withdraw ( double amount) {
        if(this.amount <amount){
            throw new InsufficientBalanceException("Insufficient Balance ");
        }
        return this.amount -amount;
    }
    public double deposit( double amount){
        return this.amount +amount;
    }


}
