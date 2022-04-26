public class displayrto
{
	public static void main(String[] args)
	{
		System.out.println("\n\n--------------RTO OFFICE--------------");
		Rtooffice rto = new Rtooffice();
		rto.setspeedlimt(100);
		int a = rto.getspeedlimt();
		System.out.println("\n\n\t1,***   SPEED LIMIT  :"+a+"   ***");


				rto.setbikemodel("R15");
				String b = rto.getbikemodel();
				System.out.println("\t2,***   BIKE  MODEL  :"+b+"   ***");

						rto.setyear(20);
						int c = rto.getyear();
						System.out.println("\t3,***   BIKE  YEAR   :"+c+"    ***");
	}
}