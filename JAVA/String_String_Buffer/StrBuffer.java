package JavaProject;

public class StrBuffer {
	public static void main(String [] args)
	{
	
		
		String s = "sathish";
		String s1 = "kumar";
		String s2 = "12345";
		int size = s.length();
		
		char[] c = {'k','a','m','a','l'};
		
		StringBuffer str = new StringBuffer(s);
		System.out.println(str);
		str.append("kumar");
		
		System.out.println(str);
		
		
		str.insert(0,"s.");
		
		System.out.println(str);
		
		str.replace(0, 1, "m");
		
		System.out.println(str);
		
		str.delete(0,2);
		System.out.println(str);		
		
		//str.reverse();
		System.out.println(str.reverse());	
		
		str.capacity();
		System.out.println(str.capacity());
		System.out.println(str.reverse());
	
		System.out.println(str.append("kamal"));
		
	}

}
