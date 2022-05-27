package com.chainsys.webapp.first;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.ServletConfig;

/**
 * Servlet implementation class LifeCycle
 */
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        System.out.println("Servelet Created");
        }
    
        // TODO Auto-generated constructor stub
        /**
    	 * @see Servlet#init(ServletConfig)
    	 */
    	public void init(ServletConfig config) throws ServletException {
    		System.out.println("servelet initialized");
    	}

    	/**
    	 * @see Servlet#destroy()
    	 */
    	public void destroy() {
    		System.out.println("servelet destroyed");
    	}

    	/**
    	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("Service Called");

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Get called");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post Called");
		doGet(request, response);
	} 

}
