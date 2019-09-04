//elab-source:Bike.java
public class Bike {
    private String licensePlate;
    private int numberOfRent;
    private boolean isAvailable;

    public Bike(String licensePlate){
        this.licensePlate=licensePlate;
        this.numberOfRent=0;
        this.isAvailable=true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumberOfRent() {
        return numberOfRent;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void rent(){
        if(this.isAvailable){
            this.numberOfRent++;
            this.isAvailable=false;
        }
    }
    public void free(){
        if (!this.isAvailable){
            this.isAvailable=true;
        }
    }
}