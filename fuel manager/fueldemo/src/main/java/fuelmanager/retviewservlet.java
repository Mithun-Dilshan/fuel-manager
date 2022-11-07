package fuelmanager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class retviewservlet
 */
@WebServlet("/retviewservlet")
public class retviewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		
		
		try {
			List<fuel> fueldetails = fuel_dbutile.getfuel();
			
		
		    request.setAttribute("fueldetails", fueldetails);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("retviewdata.jsp");
		dis.forward(request, response);
		
	}
	


	}


