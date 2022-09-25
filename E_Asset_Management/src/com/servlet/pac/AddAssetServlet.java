package com.servlet.pac;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.assest.dao.AssetDbDao;
import com.asset.beans.Asset;

/**
 * Servlet implementation class AddAssetServlet
 */
@WebServlet("/AddAssetServlet")
public class AddAssetServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public AddAssetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Asset saved");
		int id=0;
		String strName = request.getParameter("name");
		String strType = request.getParameter("categoryName");
		String strDescription = request.getParameter("assetDescription");
		String strDate = request.getParameter("dateAdded");
		String strisavailable="Yes";
		String strlendingtime = request.getParameter("lending");
		String strPrice = request.getParameter("fine");
		int finePrice = Integer.parseInt(strPrice);
		String strBanPenalty = request.getParameter("banPeriod");
		Asset asset = new Asset(id, strName, strType, strDescription, strDate, strisavailable, strlendingtime, finePrice, strBanPenalty);
		AssetDbDao dao = new AssetDbDao();
		try {
			dao.saveAsset(asset);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
