public class EmployeeCafeCard  extends CafeCard{



    public EmployeeCafeCard(){
        super("Anonymous");

    }



    public EmployeeCafeCard(String name){
        super(name);


    }





    //some overridden methods with code






    @Override
    public void addCredit(double amount) {



        if ( amount >= 200 ) {
            amount = amount+(amount*0.1);
        }
        super.addCredit(amount);


    }


    @Override
    public void paid(double amount) {
        super.paid(amount-(amount*0.1));



    }


}
