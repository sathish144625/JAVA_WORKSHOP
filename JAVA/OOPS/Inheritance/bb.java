public class bb extends aa
{
	
		public void addchild()
		{
			
 			
		System.out.println("print add child");
		add();

		}

		public void add1child()
		{
			//System.out.println("print add1 child");
			//add1();
			super.add2();

		
			
		}

			public void add2()
			{
				System.out.println("******   child print add   ******");


			}

		



		public static void main(String[] args)
		{
			bb ab = new bb();
			//ab.addchild();
			ab.add1child();
			ab.add2();
		}
	
}

