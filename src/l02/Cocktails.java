package l02;

public class Cocktails extends Drinks {
    private int cocktailType;
    private int cocktailPrice;
    public Cocktails(int size, int cold_frappe, int quantity, int cocktailType) {
        super(size, cold_frappe, quantity);
        this.cocktailType = cocktailType;
    }
    // calculate from cocktail type
    public int calculate_CocktailPrice() {
        cocktailPrice = cocktailPrice + calculatePrice();
        if ( cocktailType == 1 ){
            cocktailPrice =  cocktailPrice + 500;                     //   martini(500 ฿)
        }
        else if ( cocktailType == 2 ) {
            cocktailPrice =  cocktailPrice + 800;                    //    gimlet(800 ฿)
        }
        else if ( cocktailType == 3 ) {
            cocktailPrice =  cocktailPrice + 1500;                   //    screwdriver(1500 ฿
        }
        else if ( cocktailType == 4 ) {
            cocktailPrice =  cocktailPrice + 1750;                  //     mojito (1750 ฿)
        }
        else if ( cocktailType == 5 ) {
            cocktailPrice =  cocktailPrice + 2000;                 //      margarita (2000 ฿)
        }
        return cocktailPrice = cocktailPrice * getQuantity();
    }

    @Override
    public String toString() {
        return "Cocktail price is " +calculate_CocktailPrice()+ " Baht.";
    }

    public void setCocktailPrice(int cocktailPrice) {
        this.cocktailPrice = cocktailPrice;
    }

    public int getCocktailType() {
        return cocktailType;
    }
}

