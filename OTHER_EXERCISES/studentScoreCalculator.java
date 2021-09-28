//tell user to input score
//if studentScore >=90 and <= 100,print A
//if studentScore >=80 and <=89,print B
//If studentScore >=70 and <=79,print C
//If studentScore >=60 and <=69,print D
//If studentScore <= 59,print F

import java.util.Scanner;
public class studentScoreCalculator{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
		int score;
		
	System.out.println("Enter score");
	
		score = input.nextInt();
		

	if(score >= 90 && score <= 100){System.out.println("A");
	}
	
	if(score >= 80 && score <= 89){System.out.println("B");
	}
	
	if(score >= 70 && score <= 79){System.out.println("C");
	}
	
	if(score >= 60 && score <= 69){System.out.println("D");
	}
	
	if(score <= 59){System.out.println("F");
	}
	
	}
	
	}
	
