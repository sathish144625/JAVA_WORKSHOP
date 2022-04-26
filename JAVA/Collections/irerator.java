package JavaProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class irerator {
	
	public static void main(String[] args)
	{
		
	
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("aaa");
	al.add("bbb");
	al.add("ccc");
	
	System.out.println("original");
	Iterator<String> it = al.iterator();
	while(it.hasNext())
	{
		String e = it.next();
		System.out.println(e);
	}
	System.out.println("original");
	ListIterator<String> lt = al.listIterator();
	while(lt.hasNext())
	{
		
		
		String e = lt.next();
		System.out.println(e);
	}
	
	
	
	

}
}

