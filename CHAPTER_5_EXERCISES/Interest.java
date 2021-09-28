package chapterFive;

public class Interest {
    public static void main(String[] args) {
        double interest;
    calculateInterest(10000,2.0);
    for(int i=2; i<9 ;i++){
        System.out.printf("10000 at %d: %.2f%n",i , calculateInterest(10000,i));

    }
    }
    private static double calculateInterest(double amount,double interestRate){
        return(10000 * (interestRate / 100));
    }
}
