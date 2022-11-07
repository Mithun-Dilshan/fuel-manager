package fuelmanager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class insertservlet
 */
@WebServlet("/insertservlet")
public class insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ftype =request.getParameter("ftype");
		String  n_capacity =request.getParameter(" n_capacity");
		String f_remain  =request.getParameter(" f_remain");
		String price  =request.getParameter("price");
		String a_date  =request.getParameter("a_date");
		String nc_date  =request.getParameter("nc_date");
		String m_name  =request.getParameter("m_name");
		String eid  =request.getParameter("eid");
		
		
		
		
		boolean istrue;
		istrue =fuel_dbutile.insertservlet(ftype, n_capacity, f_remain, price, a_date,nc_date,m_name,eid);
		
		if(istrue == true ) {
			RequestDispatcher dis = request.getRequestDispatcher("sucess.jsp");
			dis.forward(request, response);
			
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsucsses.jsp");
			dis2.forward(request, response);
		}
		
		
		
		
	}

}
