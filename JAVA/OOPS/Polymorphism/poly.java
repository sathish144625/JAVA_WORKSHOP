public class poly
{
	public static void main(String[] args)
	{
		System.out.println("\n\nADDITION :");
		add ia = new add();
		ia.iadd(5,5);
		fadd fd = new fadd();
		fd.ffadd(10f,11.1f);
		dadd ad = new dadd();
		ad.ddadd(111d,222d);
		ladd ld = new ladd();
		ld.lladd(2000l,3000l);


		System.out.println("\n\nSUBRACTION :");
		sub sb = new sub();
		sb.isub(100,50);
		sb.fsub(120.23f,212.22f);
		sb.dsub(323d,432d);
		sb.lsub(321l,765l);


	}
}

class add
{
	void iadd(int a,int b)
	{
		int result=0;
		result = a + b;
		System.out.println("ADD INT RESULT  :"+result);
	}
}

class fadd
{
	void ffadd(float a,float b)
	{
		float result=0;
		result = a + b;
		System.out.println("ADD FLOAT RESULT  :"+result);
	}
}


class dadd
{
	void ddadd(double a,double b)
	{
		double result=0;
		result = a + b;
		System.out.println("ADD DOUBLE RESULT  :"+result);
	}
}
/*
class sadd
{
	void ssadd(short a,short b)
	{
		short result=0;
		result = a + b;
		System.out.println("ADD RESULT  :"+result);
	}
}*/


class ladd
{
	void lladd(long a,long b)
	{
		long result=0;
		result = a + b;
		System.out.println("ADD LONG RESULT  :"+result);
	}
}




class sub
{
	void isub(int a,int b)
	{
		int result=0;
		result = a - b;
		System.out.println("SUB INT RESULT  :"+result);
	}
	void fsub(float a,float b)
	{
		float result=0;
		result = a - b;
		System.out.println("SUB FLOAT RESULT  :"+result);
	}
	void dsub(double a,double b)
	{
		double result=0;
		result = a - b;
		System.out.println("SUB DOUBLE RESULT  :"+result);
	}
	void lsub(long a,long b)
	{
		long result=0;
		result = a - b;
		System.out.println("SUB LONG RESULT  :"+result);
	}
}
