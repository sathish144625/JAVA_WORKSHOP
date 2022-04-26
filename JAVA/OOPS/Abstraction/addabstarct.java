public class addabstarct extends abstractmethod
{
	
		public int add(int a,int b)
		{
			if(a ==0  && b ==0)
			{
				return 0;
			}
 			int c = a + b;
 			
			return c;

		}

		public float add(float a,float b)
		{
			if(a ==0  && b ==0)
			{
				return 0;
			}
 
			a=10f;
			b=20.78f;
			float c = a + b;

			return c;
			
		}

			public void add()
			{
				System.out.println("hii kamal");
			}

		



		public static void main(String[] args)
		{
			addabstarct ab = new addabstarct();

			int f = ab.add(10,20);
			System.out.println(f);
			ab.add();
		}
	
}

