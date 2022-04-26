package JavaProject;

import java.util.Scanner;

public class javaclsvowel {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the character");
		
		
		Scanner s = new Scanner(System.in);
		char c=((s.nextLine()).charAt(0));
		
		javacls myobj = new javacls();
		myobj.add(c);
	}

}
