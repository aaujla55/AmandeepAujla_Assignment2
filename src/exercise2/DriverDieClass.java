package exercise2;
import java.util.Scanner;

public class DriverDieClass{

	static int result;
	static int dieNumber;

	    public static void main(String args[]) {
	    System.out.println("Please choose your number 2 to 12");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		result = input.nextInt();

		int number = 1;boolean ans = FinalResult();
		do {

			if (ans == true) {
				System.out.println("Congratulations!You are winner\n");break;
			} 
			else {
				System.out.println("Try agian!");
			}
			ans = FinalResult();
			number++;
			if (number == 3) 
			{
				System.out.println("Game Over!!You lost 3 times!");
			}
		} while (number < 3);

	}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static boolean FinalResult() {
		boolean boolResult = false;
		dieNumber = RollingDie();
		System.out.println(dieNumber);
		if (dieNumber == result) {
			boolResult = true;
		} else {
			boolResult = false;
		}
		return boolResult;
	}

	
	
//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public static int RollingDie() {
		System.out.println("\nNumber of rolling die is 1");
		Die die = new Die();
		System.out.println("Number of rolling die is 1");
		
		
		
		int v1 = die.DieValue();
		int v2 = die.DieValue();
		int sum = v1 + v2;
		return sum;

	}

}
