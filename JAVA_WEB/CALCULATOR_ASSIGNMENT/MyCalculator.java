
public class MyCalculator {

	public static int add(int a, int b, int c) {

		return a + b + c;
	}

	public static int sub(int a, int b, int c) {

		return a - b - c;
	}

	public static int mul(int a, int b, int c) {

		return a * b * c;
	}

	public static int div(int a, int b, int c) {

		return a / b / c;
	}

	String doCalculation(String n1, String n2, String n3, String op)
	{
		String result="";
		int integerResult=0;
		int num1 = 0,num2 = 0,num3 = 0;
		if(n1 == null )return "ERRPR";
		if(n1 != "" || n1 != null)
		{	
			num1 = Integer.parseInt(n1);		
		}
		if(n2 != "" || n2 != null) { 
			num2 = Integer.parseInt(n2);
		}
		if(n3 != "" || n3 !=null) {
			num3 = Integer.parseInt(n3);
		}	
		else {
			return "ERRPR";
		}
	
					
	
// convert from string to bumber using Integer.parseInt(number1)
		switch (op) {
		
		case "add" :  integerResult = this.add(num1,num2,num3);
				  break;
			
	    case "sub" :  integerResult = this.sub(num1,num2,num3);
				  break;
	
	    case "mul" :  integerResult = this.mul(num1,num2,num3);
				  break;
				  
	    case "div" :  integerResult = this.div(num1,num2,num3);
				  break;
	
		
		//if(op != null) 
			//int n4 = Integer.parseInt(op);
			
	
		}
		
		return result + integerResult;
		
	}

}
