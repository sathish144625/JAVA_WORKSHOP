public class MilliandCenti  //ex2
{
	public void centimeter(int a, float f1)
	{
	 System.out.println("CENTIMETER IS  : " + a);
	  System.out.println("MILLIMETER IS  : "+f1 );
	
	}
	public void millimeter(int b, float f2)
	{
	System.out.println("CENTIMETER IS  :  "+b);
System.out.println("MILLIMETER IS  :  "+f2);
	}
   public static void main(String []args)
    {
        MilliandCenti ab = new MilliandCenti();
	ab.centimeter(5,7.0f);
	ab.millimeter(9,5.4f);
     }
}