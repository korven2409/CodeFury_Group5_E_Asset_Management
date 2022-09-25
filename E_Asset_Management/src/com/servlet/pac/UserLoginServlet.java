package com.servlet.pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.assest.dao.AssetDbDao;
import com.asset.beans.User;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public UserLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		User user =null;
		System.out.println("Page Submitted");
		String strUId = request.getParameter("username");
		System.out.println("User details to find: "+strUId);
		AssetDbDao dao = new AssetDbDao();
		try {
			user = dao.findByUserName(strUId);
			System.out.println("Found user with username: "+strUId);
			System.out.println(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		request.setAttribute("result", user);
		RequestDispatcher rd = request.getRequestDispatcher("employeedetails.jsp");
		rd.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println(user.getName());
	}

}
