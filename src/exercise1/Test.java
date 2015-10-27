package exercise1;
import java.util.Random;
import java.util.Scanner;



public class Test {

	public void simulateQuestion(int questionNumber)
	{
		if(questionNumber == 1)
		{
			System.out.println("Question 1. \nWhich methods can access to private attributes of the class");
			System.out.println("1. Only static methods of the same class");
			System.out.println("2. Only instances of the same class");
			System.out.println("3. Only methods those defined in the same class.");
			System.out.println("4. Only classes available in the same package\n");
		}
		else if(questionNumber == 2)
		{
			 System.out.println("Question 2. \nWhat is an aggregate object?");
				
				System.out.println("1. An object with only primitive attributes");
				System.out.println("2. An instance of a class which has only static methods");
				System.out.println("3. An instance which has other objects.");
				System.out.println("4. None of the above\n");
		}
		else if(questionNumber == 3)
		{
			System.out.println("Question 3. \nWhich of the following is considered as a blue print that defines the variables and methods common to all of its objects of a specific kind?");
			
			System.out.println("1.Object");
			System.out.println("2. Class.");
			System.out.println("3. Method");
			System.out.println("4. Real data types\n");
		}
		else if(questionNumber == 4)
		{
			 System.out.println("Question 4. \nWhich of the following is not a return type?");
				
				System.out.println("1. boolean");
				System.out.println("2. void");
				System.out.println("3. public.");
				System.out.println("4. Button\n");
		}
		else if(questionNumber == 5){
		
		System.out.println("Question 5. \nWhat is the data type for the number 9.6352?");
		
		System.out.println("1. float");
		System.out.println("2. double.");
		System.out.println("3. Float");
		System.out.println("4. Double\n");
		}}
		
//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	boolean result = false;int counter=0;
	
	public boolean checkAnswer(int question, int answer)
	{
		if(question == 1)
		{
			if(answer == 3)
			{	result =true;
				counter++;
			}
			else
				result = false;
		}
		else if(question == 2)
		{
			if(answer == 3)
			{
				
				result =true;
				counter++;
			}
			else
				result = false;
		}
		else if(question == 3)
		{
			if(answer == 2)
			{
				
				result =true;
				counter++;
			}
			else
				result = false;
		}
		else if(question == 4)
		{
			if(answer == 3)
			{
				
				result =true;
				counter++;
			}
			else
				result = false;
		}
		else if(question == 5)
		{
			if(answer == 1)
			{
				
				result = true;
				counter++;
			}
			else
				result = false;
		}
		return result;
	}
//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public void simulateMessage(boolean r)
	{
		Random object = new Random();
		if(r){
			switch ( object.nextInt(4))
			{
			case 0:System.out.println("Keep it up !\n");
			break;
			case 1:System.out.println("Very Good!\n");
			break;
			case 2:System.out.println("Good Job!\n");
			break;
			case 3:System.out.println("Excellent !\n");
			break;			
			}
		}
		else if(!r)
		{
			switch ( object.nextInt(4))
			{
			case 0:System.out.println("Please.Try Again!\n");
			break;
			case 1:System.out.println("Wrong. Try once more!\n");
			break;
			case 2:System.out.println("Wrong Answer. Anyway don't give up!\n");
			break;
			case 3:System.out.println("No. Keep trying!\n");
			break;			
			}
		}
	}
	
	int questNum = 1;
	
	int tot = 5;
	public void inputAnswer()
	{
		int question = 1;
		do{
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
			simulateQuestion(question);
			
			System.out.print("Choose your answer : (1,2,3,4)");
			int ans = scanner.nextInt();
			boolean result=checkAnswer(questNum,ans);
			simulateMessage(result);
			questNum++;
			question++;
		}while(question<6);
		System.out.println("Number of Correct Answers : "+counter);
		System.out.println("Number of Incorrect Answers : "+(tot-counter));
		int output = (counter*100)/tot;
		System.out.println(output+"% Correct.");
	}
	
	
}


