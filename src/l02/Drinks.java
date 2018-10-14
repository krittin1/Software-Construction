package l02;

public class Drinks {
    private int size;
    private int cold_frappe;
    private int quantity;
    private int price;

    public Drinks (int size, int cold_frappe, int quantity ) {
        this.size = size;
        this.cold_frappe = cold_frappe;
        this.quantity = quantity;

    }


    public int calculatePrice()  {
        // calculate  from size
        if ( size == 1 ){                       //  short  size  10 ฿
            price = price + 10;
        }
        else if ( size == 2 ) {                //   tall   size  20 ฿
            price = price + 20;
        }
        else  if ( size == 3 ) {               //    grande  size  30 ฿
            price = price + 30;
        }
        // calculate from cold or frappe
        if ( cold_frappe == 1 ) {             //      cold   10  ฿
            price = price + 10;
        }
        else if ( cold_frappe == 2 ) {       //       frappe 15  ฿
            price = price + 15;
        }
        return price;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
