package JavaProject;

public class DoubleArray {
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException
	{
	try
	{
	int a[][] = new int[][] {{1,2,3},{4,5,6}};
	int[][] b = new int[][] {{1,2,3},{4,5,6}};
	
	int i=0,j=0;
	int[][] c = new int[3][3];
	


	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j] +"  ");
		}
		System.out.println();
	}
	}
	catch(ArrayIndexOutOfBoundsException ex)
	{
		
	}
	
	finally
	{
		
	}
}
	
	
}

