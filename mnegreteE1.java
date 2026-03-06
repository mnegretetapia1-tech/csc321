 /*
 *Moises Negrete 
 *Exam 1
 */



import java.util.Scanner;



public class exam1{
	public static void main(String[] args){
	int targetnum = 15;
	int attempts = 0;
	int max_attempts = 3;
	boolean won = false;

	Scanner scan = new Scanner(System.in);

	while(true){
	System.out.println("enter a num between 10 and 20");
	int x = scan.nextInt();
	attempts +=1; 

		if(x < targetnum){
		   System.out.println("answer is too low");
		}else if (x > targetnum){
			System.out.println("too high");
		}
		else{
			won = true;
			System.out.println("you won");
			break;
		}
		
			if(attempts == max_attempts){
				System.out.println("You lost");
				break;

		   }

		}

	}	
}
