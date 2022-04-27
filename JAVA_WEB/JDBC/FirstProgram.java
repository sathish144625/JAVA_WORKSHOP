

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstProgram")
public class FirstProgram extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//
		response.getWriter().append("HIII Kamal ");
		myCalc calc =  new myCalc();
		int k =  calc.add(7012, 1233);
		int s =  calc.sub(434, 34);
		
		PrintWriter out =  response.getWriter();
		out.println("mycalc was called adding 7012, 1233 = " + k);
		out.println("mycalc was called subtracfting  434, 34) = " + s);
		
		myDBCon mycon =  new myDBCon();
		mycon.connectAndQuery();
	    
		
		
	}

}
