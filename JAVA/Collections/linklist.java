package JavaProject;

import java.util.LinkedList;

class linklist {
	
	private String name;
	private int number;
	private int age;
	
	public void address(String n, int r, int a)
	{
		name = n;
		number = r;
		age = a;
	}
	public String getaddress()
	{
		return name + "\n" + number + "\n" + age + "\n";
	}

}


class test
{
	public static void main(String[] args)
	{
		//LinkedList<address> ln = new LinkedList<address>();
		
	}
}