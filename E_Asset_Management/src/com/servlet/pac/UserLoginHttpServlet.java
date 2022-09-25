package com.servlet.pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assest.dao.AssetDbDao;
import com.asset.beans.User;

/**
 * Servlet implementation class UserLoginHttpServlet
 */
@WebServlet("/UserLoginHttpServlet")
public class UserLoginHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginHttpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user =null;
		System.out.println("Page Submitted");
		String strUId = request.getParameter("username");
		System.out.println("User details to find: "+strUId);
		AssetDbDao dao = new AssetDbDao();
		PrintWriter out = response.getWriter();
		
		
	}

}
