public class test5
{
	public static void main(String[] args)
	{
		int a = 5,b = 10,c = 0;
		System.out.println(a+ ","+ b +"," +c);

		c = b;
		b = a;
		a = c;


		System.out.println( a + ","+ b);
		 
	}
}