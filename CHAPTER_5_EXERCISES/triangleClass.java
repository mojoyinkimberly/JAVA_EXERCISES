package chapterFive;

public class triangleClass {
    public static void main(String[] args) {

        /** for (int counter = 1; counter <= 10; counter++) {
            for (int star = 1; star <= counter; star++) {
               System.out.print(" *");
           }
          System.out.println();
        }
        **/

        /**for (int counter = 10; counter >= 1; counter--) {
            for (int star = 1; star <= counter; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
**/


    /**for (int counter = 1; counter <= 10; counter++) {

        for (int star = 1; star <= counter; star++) {
            System.out.print(" ");
        }
           for (int counters = 10; counters >= counter; counters--) {
                System.out.print("*");
            }
        System.out.println();
        }
     **/

        for (int counter = 10; counter >= 1; counter--) {
            for (int star = 1; star <= counter; star++) {
                System.out.print(" ");
            }
            for(int counts=10; counts >= counter; counts--){
            System.out.print("*");
        }
            System.out.println();
    }
}
}

