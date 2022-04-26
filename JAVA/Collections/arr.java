package JavaProject;

import java.util.ArrayList;
import java.util.LinkedList;

public class arr {

	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("INITIAL ARRAY SIZE :" + al.size());
		
		
		al.add("a");
		al.add("b");
		al.add("d");
		al.add("c");
		al.add("e");
		
		
		System.out.println("FINALY ARRAY SIZE :" + al.size());
		 System.out.println(" ARRLIST");
		System.out.println(al);
		
		Link lk = new Link();
		 LinkedList<String> llist =  lk.linkedListExample(al);
		 System.out.println("LINKED LIST HAVING ARRLIST");
		 System.out.println(llist);
	}

}
