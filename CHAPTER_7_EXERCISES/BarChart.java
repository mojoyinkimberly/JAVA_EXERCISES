package chapterSeven;

public class BarChart {
    public static void main(String[] args) {
int[] array ={0,0,0,0,0,0,1,2,4,2,1};
        System.out.println("Grade Distribution: ");
        for(int counter=0;counter< array.length;counter++) {
            if (counter == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            for (int stars = 0; stars < array[counter]; stars++)
                System.out.print("*");
            System.out.println();
        }
        }
        }
//            for (int counter = 1; counter < 6; counter++) {
//                System.out.print("");
//                for (int star = 1; star < 5; star++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }

//        for (int counter = 1; counter < 6; counter++) {
//            for (int star = 0; star < 5; star++)
//                System.out.print("*");
//                System.out.print(counter);
//            System.out.println();
//            }

//        for(int i = 1; i <=5; i++){
//            for(int a = 1; a <= 5; a++){
//                System.out.print("*");
//            }
//            System.out.print(i);
//            System.out.println();
//        }
//
//        }
//    }
//

