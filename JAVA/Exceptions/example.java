public class example
{
	public static String name="Sathish";
	public static int mark=1;
	public static int mark1=0;
	public static int total;

	public static void pr()
	{
		
			try
		{
		
			total =  example.mark / example.mark1;
		    System.out.println(total);

		} 
	
		catch(Exception e)
		{ 
			System.out.println("ERROR"+e.getLocalizedMessage());


		}

		finally
		{
		System.out.println("FINALLY");
		}
	
		

		
		
		
		

	

	
	}
public static void main(String[] args)
{
	example.pr();
	System.out.println(example.total);

	StringBuffer sb = new StringBuffer();//String buffer
	sb.append("Sathish");
	sb.append("kamal");
	sb.append("Sundar");
	System.out.println(sb);


	String s1="Sachin";  
   String s2="Sachin";
   String s3 = "Sathish"
   System.out.println(s1.compareTo(s2));
	
}

}