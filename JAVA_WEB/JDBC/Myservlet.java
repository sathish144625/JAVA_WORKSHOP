

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")
public class Myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String result;
		String number1 = request.getParameter("firstno");
		String number2 = request.getParameter("secondno");
		String number3 = request.getParameter("thirdno");

		if(number1 == "" || number2 =="" || number3 == "")  
		{
			response.sendRedirect("/MyProject/NewFile.jsp?result=Error No inputs were given" );
			return;
		}		
		else
		{
			//3 inputs are given
			String op = request.getParameter("op");
			MyCalculator calc = new MyCalculator();
			result = calc.doCalculation(number1,number2,number3,op);
			response.sendRedirect("/MyProject/NewFile.jsp?result=" + result);
		}
		
			
		
		
	}

}
