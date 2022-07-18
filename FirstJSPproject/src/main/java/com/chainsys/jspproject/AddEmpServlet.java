package com.chainsys.jspproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddEmpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("click").equals("ADD_EMP")) {
			String source = "AddNewEmployee";
			String message = "<h1>Error while " + source + "</h1>";
			PrintWriter out = response.getWriter();
			Employee newemp = null;
			int result = 0;
			int empId = 0;
			String testname = null;
			try {
				newemp = new Employee();
				String id = request.getParameter("id");
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					message += "Error in Emp id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				empId = Integer.parseInt(id);
				try {
					Validator.CheckNumberForGreaterThanZero(empId);
				} catch (InvalidInputDataException err) {
					message += "Error in Emp id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setEmp_id(empId);
//--------------------------------
				String fname = request.getParameter("fname");
				testname = fname;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(fname);
				} catch (InvalidInputDataException err) {
					message += "Error first name input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
				}
				newemp.setFirst_name(fname);
//-----------------------------------
				String lname = request.getParameter("lname");
				testname = fname;
				try {
					Validator.checkStringOnly(testname);
				} catch (InvalidInputDataException e) {
					e.printStackTrace();
					return;
				}
				try {
					Validator.checklengthOfString(lname);
				} catch (InvalidInputDataException err) {
					message += "Error in Last name input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setLast_name(lname);
//----------------------------------			
				String email = request.getParameter("email");
				try {
					Validator.checkEmail(email);
				} catch (InvalidInputDataException err) {
					message += "Error in email input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setEmail(email);
//--------------------------------------			
				SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
				String emp_HireDate = request.getParameter("hdate");
				// Date hire_date=hire_dateFormate.parse(emp_HireDate);

				Date newDate = null;
				try {
					newDate = hire_dateFormate.parse(emp_HireDate);
				} catch (ParseException e) {
					message += "Error Higher Date input</p>";
					String errorPage = ExceptionManager.handleException(e, source, message);
					out.print(errorPage);
					return;
				}

				newemp.setHire_date(newDate);
//----------------------------------------
				String jobId = request.getParameter("jobid");
				try {
					Validator.checkJobId(jobId);
				} catch (InvalidInputDataException err) {
					message += "Error in Job id input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setJob_id(jobId);
//---------------------------------------			
				String sal = request.getParameter("salary");
				try {
					Validator.checkStringForParseInt(sal);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
				}
				float salParse = Float.parseFloat(sal);
				try {
					Validator.CheckNumberForGreaterThanZero(salParse);
				} catch (InvalidInputDataException err) {
					message += "Error in Last name input</p>";
					String errorPage = ExceptionManager.handleException(err, source, message);
					out.print(errorPage);
					return;
				}
				newemp.setSalary(salParse);
//----------------------------------------------			
				// result = EmployeeDao.insertEmployee(newemp);
			} catch (Exception e) {
				message += "Error in Last name input</p>";
				String errorPage = ExceptionManager.handleException(e, source, message);
				out.print(errorPage);
				return;
			}
			result = EmployeeDao.insertEmployee(newemp);
			request.setAttribute("insertemp", result);
			RequestDispatcher rd = request.getRequestDispatcher("/insertemp.jsp");
			rd.forward(request, response);
		} else if (request.getParameter("click").equals("UPDATE_EMP")) {
			doPut(request, response);
		} else if (request.getParameter("click").equals("DELETE_EMP")) {
			doDelete(request, response);
		}
	}

}
