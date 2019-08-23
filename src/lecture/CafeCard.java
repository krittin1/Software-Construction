

public class CafeCard {

    private String cardHolderName;
    private double balance;

    private CafeCard(String cardHolderName, double balance) {
        this.cardHolderName = cardHolderName;
        this.balance = balance;
    }


    public CafeCard(){
        this("Anonymous",0);

    }


    public CafeCard(String name) {
        this(name,0);
    }

    public void getCardinfo(){
        System.out.println("card holder name: "+cardHolderName);
        System.out.println("balance: "+balance);
    }

    public void addCredit(double amount) {

        if ( amount >= 100 ) {
            balance = balance + amount;
        }
        else{
            System.out.println("Top up, the minimum amount should be more than 100 baht.");
        }

    }


    public void paid(double amount) {

        if ( balance >= amount ) {
            balance = balance - amount;
        }
        else{
            System.out.println("Your amount is not enough.");
        }

    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public double getBalance() {
        return balance;
    }
}
