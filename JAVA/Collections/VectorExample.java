package JavaProject;
import java.io.*;
import java.util.*;

public class VectorExample {
	
	public static void main(String[] args)
	{
		int n=5;
		Vector<Integer> v = new Vector<Integer>(n);
		
		for (int i = 1; i <= n; i++)
            v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        
        for (int i = 0; i < v.size(); i++)
        	 
            // Printing elements one by one
            System.out.println(v.get(i) + " ");
        Vector v1 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);        
        System.out.println("Vector v1 is " + v1);        
        System.out.println("The Object that is replaced is: "+ v1.set(0, 21));        
        System.out.println("Vector v1 is " + v1);
        System.out.println(v1.remove(0));        
        System.out.println("Vector v1 is " + v1);        
        for (int str : v) {           
            System.out.println("Vector is = " +str);  
         }  
        v.addAll(v1);
        System.out.println(v);
        Vector<String> vc = new Vector<>(3);       
        vc.add("A");  
        vc.add("B");  
        vc.add("C");           
        vc.addElement("sundar");  
        for (String str : vc) {           
            System.out.println("Element= " +str);
         } 
        System.out.println("Cloned vector: "+vc.clone()); 
        
        Iterator<String> itr = vc.iterator();  
        while(itr.hasNext()){  
             System.out.println(itr.next());  
        }   
        
        
        		   
 
	}

}
