package IPLMatches;

public class iplteam
{
	public void teamlist()
	{
		System.out.println("1.CSK");
		System.out.println("2.MI");
		System.out.println("3.KKR");
		System.out.println("4.SRH");
		System.out.println("5.RR");
	}
	public static void main(String[] args)
	{
		
		firstmatch fm = new firstmatch();
		fm.m1();
		secondmatch ms = new secondmatch();
		ms.m2();
	}
}


class firstmatch
{
	void m1()
	{
		iplteam ip = new iplteam();
		ip.teamlist();
		System.out.println("Match List");
		System.out.println("CSK vs Mi");
	}

	public static void main(String[] args)
	{
		
		firstmatch f1 = new firstmatch();
		f1.m1();
		System.out.println("\n\t\tCSK WIN");
	}
}
class secondmatch
{
	void m2()
	{
		
		System.out.println("KKR vs RR");	
	}
}