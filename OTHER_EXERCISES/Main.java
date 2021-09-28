package exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static Cart cart;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whose cart is this?");
        String name = scanner.next();
        cart = new Cart(name);
        String userResponse="";
       do{
            //if (userResponse.equalsIgnoreCase(""))
            System.out.println("What did they buy?");
           String itemName = scanner.next();
            System.out.println("How much per piece?");
            BigDecimal itemPrice = scanner.nextBigDecimal();
            System.out.println("How many did they buy?");
            int itemQuantity = scanner.nextInt();
            System.out.println("Any other thing?");
            userResponse=scanner.next();
            Item item=new Item(itemName,itemPrice,itemQuantity);
            cart.addItems(item);
         }while (userResponse.equalsIgnoreCase("yes"));

        System.out.println(cart);

    }
}
