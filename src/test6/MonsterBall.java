package test6;

public class MonsterBall {
    private double price;
    private double sellfor;
    private double value;
    private String type;

   // public MonsterBall(String price,String sellfor,double value,String type) {
    public MonsterBall(String type,double price,double sellfor,double value) {
        this.price = price;
        this.sellfor = sellfor;
        this.value = value;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public double getSellfor() {
        return sellfor;
    }

    public String getType() {

        return type;
    }

    public double getValue() {
        return value;
}


    public String toString(){
            return "MonsterBall{type='"+getType()+"', price="+getPrice()+", sellFor="+getSellfor()+", ballValue="+getValue()+"}";
    }
    }


