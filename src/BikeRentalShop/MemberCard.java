//elab-source:MemberCard.java
public class MemberCard {
    private String name;
    private int numberOfRent;
    private Bike bike;

    public MemberCard(String name){
        this.name=name;
        this.numberOfRent=0;
        this.bike = new Bike("");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfRent() {
        return numberOfRent;
    }

    public String viewBikeLicensePlate() {
        return bike.getLicensePlate();
    }
    public void rentBike(Bike bike){
        if (this.bike.getLicensePlate().equals("") && bike.isAvailable()){
            bike.rent();
            this.numberOfRent++;
            this.bike=bike;
        }
    }
    public void returnBike(){
        if (!this.bike.getLicensePlate().equals("")){
            this.bike.free();
            this.bike = new Bike("");
        }
    }
}