package chapterFive;

public class CharSwitch {
    public static void main(String[] args) {
        char charValue = 'b';

        switch (charValue){
            case 'a':
            case 'b':
            case 'c':
            case 'd':
                System.out.println("value was an a,b,c or d");
                break;
            case 'e':
                System.out.println("value was e");
                break;
            default:
                System.out.println("value was neither a,b,c,d,or e");
        }
        }

    }
