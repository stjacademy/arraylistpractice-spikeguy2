package practicearray;
import java.util.ArrayList;

public class minilabs {
	public static void main(String[]args)
	{
		System.out.println(getListOfFactors(36));
		System.out.println(keepOnlyCompositeNumbers(getListOfFactors(36)));
	}
	
	public static ArrayList getListOfFactors(int num)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
				factors.add(i);
		}
		
		return factors;
	}
	
	public static ArrayList keepOnlyCompositeNumbers(ArrayList<Integer> factors)
	{
		int count=0;
		
		for(int i=0; i< factors.size(); i++)
		{
			for(int j=2; j<factors.get(i); j++)
			{
				if(factors.get(i)%j==0)
					count++;
			}
			
			if(count==0 || factors.get(i)==2)
			{
				factors.remove(i);
				i--;
			}
			
			count=0;
		}
		return factors;
		
		
		
	}
	
}
