package jap.com;

import java.io.IOException;

import org.apache.commons.logging.LogFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jap.com.model.c_t_house_hold;
import jap.com.service.HouseHoldService;

//â∆åvïÎâÊñ ÇÃìoò^çXêVèàóù
public class web004 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public web004() {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		addData(request);
		
		
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = context.getRequestDispatcher("/p1.jsp");
		dispatcher.include(request, response);
	}
	
	private void addData(HttpServletRequest request) {
		String addDate = request.getParameter("add_date");
		String addType = request.getParameter("add_type");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HouseHoldService service = (HouseHoldService)ctx.getBean("houseHoldService");
		System.out.println(service.getClass());
		
		c_t_house_hold cthh = new c_t_house_hold();
		
		cthh.setPay_date("20171125");
		cthh.setPay_d_no("1234");
		cthh.setP_type("F");
		cthh.setAmount(100);
		cthh.setDel_flag("0");
		cthh.setCreate_date("20171125");
		cthh.setCreate_user_cd("zhanyang");
		cthh.setUpdate_date("20171125");
		cthh.setUpdate_user_cd("zhanyang");
		
		service.add(cthh);
		
		ctx.close();
	}
}
