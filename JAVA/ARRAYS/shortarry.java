import java.util.*;  //ex5
public class shortarry
{
	public static void main(String[] args)
	{
		int[] a = new int[]{1,8,9,4,6,3,2};
		Arrays.sort(a);
		System.out.println("Sort ARRAY:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}