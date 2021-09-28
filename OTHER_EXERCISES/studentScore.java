//tell user to input score
//if studentScore >= 60,print pass
//if studentScore < 60,print fail

import java.util.Scanner;
public class studentScore{

	public static void main(String[] args){
	
		int score;
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter score");
	
		score = input.nextInt();
		

	if(score >= 60){System.out.println("pass");
	
}
	if(score < 60){System.out.println("fail");
	
}



}


}

