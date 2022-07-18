package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jspproject.dao.EmployeeDao;
import com.chainsys.jspproject.pojo.Employee;
import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;

/**
 * Servlet implementation class DeleteEmpServlet
 */
@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteEmpServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String source = "DeleteEmployee";
		String message = "<h1>Error while " + source + "</h1>";
		PrintWriter out = response.getWriter();
		String id = null;
		Employee newemp = null;
		try {
			newemp = new Employee();
			id = request.getParameter("id");
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) {
			message += "Error in Emp id input</p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;
		}
		int emp_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(emp_id);
		} catch (InvalidInputDataException e) {
			message += "Error in Emp id input</p>";
			String errorPage = ExceptionManager.handleException(e, source, message);
			out.print(errorPage);
			return;

		}
		int result = EmployeeDao.deleteEmployee(emp_id);
		request.setAttribute("DeleteEmployee", result);
		RequestDispatcher rd = request.getRequestDispatcher("/DeleteEmp.jsp");
		rd.forward(request, response);
		newemp.setEmp_id(emp_id);
	}

}
