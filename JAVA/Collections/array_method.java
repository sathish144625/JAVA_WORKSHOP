package JavaProject;

import java.util.Scanner;

public class array_method {
	
	public int roll_no;
	public String name;
	
	
	array_method(int roll, String n)
	{
		roll_no = roll;
		name = n;
		
	}

	public static void main(String[] args)
	{
		array_method[] ar;
		ar = new array_method[3];
		
		/*Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length;i++)
		{
			
		}*/
		
		
		ar[0] = new array_method(1,"sathish");
		ar[1] = new array_method(2,"sundar");
		ar[2] = new array_method(3,"kamal");
		
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i].roll_no +"  " + ar[i].name);
		}
		
		
		
		
		
	}
}
