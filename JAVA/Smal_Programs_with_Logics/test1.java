
public class test1
{
	public static void main(String[] args)
	{
	


		
		String value = "sathish";
		int c = 0;
		System.out.println("Enter the vowel  :"+value);
		for(int i=0;i<value.length();i++)
		{
			if(value.charAt(i)=='a' || value.charAt(i)=='e'|| value.charAt(i)=='i'|| value.charAt(i)=='o' || value.charAt(i)=='u')
			{
				c++;
			}

		}
		System.out.println(c);
	}
}