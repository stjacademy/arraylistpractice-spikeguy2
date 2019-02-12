package practicearray;
import java.util.ArrayList;

public class minilabs {
	public static void main(String[]args)
	{
		System.out.println(getFactor(36));
	}
	
	public static ArrayList getFactor(int num)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				factors.add(i);
		}
		
		return factors;
	}
	
	public static void removePrime(ArrayList factors)
	{
		
	}
	
}
