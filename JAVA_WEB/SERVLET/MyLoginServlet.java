

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyLoginServlet")
public class MyLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        private Object name;
        private Object password;
        
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		String result;
		String number1 = request.getParameter("Name");
		String number2 = request.getParameter("PassWord");
		
		LoginModel calc = new LoginModel();
		result = calc.doCalculation(number1,number2);
		response.sendRedirect("/LoginProject/NewFile.jsp?result=" + result);
	}

}
