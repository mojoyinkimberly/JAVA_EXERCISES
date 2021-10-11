package chapterFour;

public class Kata {


    public int numberOfCopies(int i) {
        int copiesBought= i;
        int amountToBePaid = 0;
        if(copiesBought>= 1 && copiesBought <=4){
            amountToBePaid = copiesBought*1500;
        }
        if(copiesBought>=5 && copiesBought<=9){
            amountToBePaid = copiesBought*1400;
        }
        if(copiesBought>=10 && copiesBought<=29){
            amountToBePaid = copiesBought*1200;
        }
        if(copiesBought>=30 && copiesBought<=49){
            amountToBePaid = copiesBought*1100;
        }
        if(copiesBought >=50 && copiesBought<= 99) {
            amountToBePaid = copiesBought * 1000;
        }
        if(copiesBought >=100 && copiesBought<=199){
            amountToBePaid = copiesBought*900;
        }
        if(copiesBought>=200){
            amountToBePaid = copiesBought*800;
        }
        return amountToBePaid;

    }
}