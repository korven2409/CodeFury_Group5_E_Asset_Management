package com.servlet.pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

import com.assest.dao.AssetDbDao;
import com.asset.beans.Asset;
import com.mysql.cj.xdevapi.JsonArray;

/**
 * Servlet implementation class AssetShowServlet
 */
@WebServlet("/AssetShowServlet")
public class AssetShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssetShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		org.json.JSONArray json = null;
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		AssetDbDao dao = new AssetDbDao();
		List<Asset> assetList = new ArrayList<>();
		try {
			assetList = dao.showAllAssets();
			json = new org.json.JSONArray(assetList);
			System.out.println(json);
//			out.println(json);
//			out.println("<h1> Hello</h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		request.setAttribute("result", json);
		RequestDispatcher rd = request.getRequestDispatcher("Assets.jsp");
		rd.forward(request, response);
	}

}
