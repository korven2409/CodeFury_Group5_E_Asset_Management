package com.servlet.pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.assest.dao.AssetDbDao;
import com.asset.beans.User;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Page Submitted");
		int id = 0;
		String strName = request.getParameter("username");
		String strRole = request.getParameter("user");
		String strPhone = request.getParameter("phonenumber");
		String strEmail = request.getParameter("useremail");
		String strUsername = request.getParameter("userid");
		String strPassword = request.getParameter("Password");
		User us = new User(id,strName, strRole, strPhone, strEmail, strUsername, strPassword);
		AssetDbDao usdao = new AssetDbDao();
		try {
			usdao.save(us);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//		PrintWriter pw = response.getWriter();
//		String s = request.getParameter("username");
//		pw.println("<h1>Hello,"+s);
//		pw.close();
	}

}
