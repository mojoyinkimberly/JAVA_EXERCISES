package exercise;

import java.math.BigDecimal;

public class Item {
    private final String name;
    private BigDecimal price;
    private  int quantity;

    public Item(String itemName, BigDecimal itemPrice, int itemQuantity){
    this.name=itemName;
    this.price=itemPrice;
    this.quantity=itemQuantity;

}

    @Override
    public String toString() {
        return name + " " + price + " " + quantity + " " + calculateTotal();
    }


    public BigDecimal calculateTotal(){
        return price.multiply(BigDecimal.valueOf(quantity));
    }

}
