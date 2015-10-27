package exercise2;
import java.util.Random;

public class Die {

	int num;
	Random r = new Random();
	public Die()
	{this.num = r.nextInt(6)+1;}
	public int DieValue()
	{return this.num;}
	
	
}
