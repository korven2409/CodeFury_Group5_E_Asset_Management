package com.servlet.pac;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.assest.dao.AssetDbDao;
import com.asset.beans.Asset;

/**
 * Servlet implementation class AssetDetails
 */
@WebServlet("/AssetDetails")
public class AssetDetails extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public AssetDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		org.json.JSONArray json = null;
		//PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		AssetDbDao dao = new AssetDbDao();
		List<Asset> assetList = new ArrayList<>();
		try {
			assetList = dao.showAllAssets();
			//json = new org.json.JSONArray(assetList);
			//System.out.println(json);
			System.out.println(assetList);
//			out.println(json);
//			out.println("<h1> Hello</h1>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		//request.setAttribute("result", json);
		request.setAttribute("result", assetList);
		RequestDispatcher rd = request.getRequestDispatcher("Assets.jsp");
		rd.forward(request, response);
	}

}
