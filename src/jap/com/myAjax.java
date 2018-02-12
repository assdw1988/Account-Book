package jap.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jap.com.util.DatabaseUtil;


public class myAjax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public myAjax() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doFire(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doFire(request, response);
	}

	private void doFire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StringBuffer reBuff = new StringBuffer();
		String reCheck = "";
		
		StringBuffer tempBuffer = new StringBuffer();
		tempBuffer = new StringBuffer();
		tempBuffer.append(" SELECT * ");
		tempBuffer.append("   FROM c_m_user ");
		tempBuffer.append("  WHERE user_cd = ? ");
		tempBuffer.append("    AND password = ? ");

		String userCd = request.getParameter("userCd");
		String pw = request.getParameter("pw");

		Connection conn = DatabaseUtil.getConn();
		String[] tempPar = new String[] { userCd, pw };
		List<HashMap<Object, Object>> tempList = DatabaseUtil.selectFirst(tempBuffer.toString(), conn, tempPar);

		if (tempList.size() == 0) {
			reCheck = "NG";
		} else {
			reCheck = "OK";
		}
		
		reBuff.append("{\"longin\":\"").append(reCheck).append("\"}");
		PrintWriter out = response.getWriter();
	    out.print(reBuff.toString());
	    out.flush();
	    out.close();
	}
}
