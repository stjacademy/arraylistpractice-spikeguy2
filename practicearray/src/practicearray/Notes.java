package practicearray;
import java.util.ArrayList;
public class Notes {
	
	public static void main(String[]args)
	{
		/*int[] grades=new int[2];
		
		grades[0]=100;
		grades[1]=102;
		
		for(int i=0; i<2; i++)
			System.out.println(grades[i]);*/
		ArrayList<Integer> grades= new ArrayList<Integer>();
		
		grades.add(92);// adds the numbers in order-current location is 0
		grades.add(100);// current location is 1
		grades.add(1);
		grades.add(23);
		System.out.println(grades);
		
		//grades.remove(2);//-> this removes the thing at location 2
		System.out.println("I removed "+ grades.remove(2)); // can do two steps at once-removing and printing
		System.out.println(grades);
		
		grades.add(1,99);// (location,value) puts value in location and moves the other values
		System.out.println(grades);
		
		grades.set(1, 1000);
		System.out.println("stuff"+grades);
		
		
		
		for(int i=0; i<grades.size(); i++)// its 'grades.size' not length
		{
			System.out.println(grades.get(i)); // its 'grades.get(i)' not grades[i]
		}
		
		//for each loop--do not remove in a for each loop, because if the size changes during loop it gets error
		for(Integer value: grades) {
			System.out.println(value);
			//grades.remove(grades.get(0));
		}
		
	}

}
