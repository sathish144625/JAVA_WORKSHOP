public class Rto extends abstractmethodrto
{
	public  int add(int speedlimt)
	{
		System.out.println("SETSPEED LIMIT:"+speedlimt);
		return speedlimt;
	}



	public  String add(String c)
	{
		return c;
	}
	

	public  String add1(String t)
	{
		return t;
	}

		public static void main(String[] args)
		{
			Rto ab = new Rto();

			 ab.add(150);
			//System.out.println("SETSPEED LIMIT:"+f);
			String g = ab.add("250cc");
			System.out.println("CC:"+g);
			String m = ab.add1("car");
			System.out.println("Vehicle Type:"+m);

			//abstractmethodrto ad = new abstractmethodrto();
			ab.add2();

		}
	
}

