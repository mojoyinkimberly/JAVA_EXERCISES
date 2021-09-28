package exercise;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    private final String name;
    private final double vat = 0.075;

    public Cart(String ownerName) {
        this.name = ownerName;
    }

   @Override
   public String toString() {
       String stringToReturn="";
        for (Item item : items) {
            stringToReturn+=item.toString()+"\n";

        }
        return stringToReturn;
    }
    public void addItems(Item item) {
        items.add(item);
    }
    public BigDecimal calculateTotalPrice(){
        BigDecimal total= BigDecimal.ZERO;
        for(Item item:items){
            total=total.add(item.calculateTotal());
        }
        return total;
    }
    public BigDecimal calculateVat(){

        return calculateTotalPrice().multiply(BigDecimal.valueOf(vat));
    }

    public BigDecimal calculateGrandTotal(){

        return calculateTotalPrice().add(calculateVat());
    }

}

