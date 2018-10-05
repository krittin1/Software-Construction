package test2;

public class Customer {
    private double customerSpent;
    private double stamps;


    public Customer( double customerSpent){

        this.customerSpent = customerSpent;
    }
    public double getCustomerSpent()
    {
        return customerSpent;
    }

    public double calculateStamps (double a){
        double stamps = getCustomerSpent()/50;
        return (double)stamps;
    }




}


