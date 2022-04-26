package JavaProject;

public class StringExample {
 
		public static void main(String [] args)
		{			
			String s = "sathish";
			String s1 = "kumar";
			String s2 = "12345";
			int size = s.length();
			
			char[] c = {'k','a','m','a','l'};
			
			String ss = new String(c);
			System.out.println(c);
			
			System.out.println(s.length());
			
			for(int i = 0; i < size; i++)  
			{  
			// reverse order  
			System.out.print(s.charAt(s.length() - i - 1));  
			
			}
		}	
}
