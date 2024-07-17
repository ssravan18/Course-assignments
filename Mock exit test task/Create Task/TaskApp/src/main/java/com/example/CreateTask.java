package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateTask
 */

public class CreateTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
        String description = request.getParameter("description");
        String dueDate = request.getParameter("dueDate");
        String priority = request.getParameter("priority");
        
        
        String proxyUri = System.getenv("VSCODE_PROXY_URI");

     
        System.out.println(proxyUri);
        
        if (title == null || title.isEmpty() || description == null || description.isEmpty() ||
                dueDate == null || dueDate.isEmpty() || priority == null || priority.isEmpty()) {
        	String successUrl = proxyUri + "/error.jsp";
        	response.sendRedirect(successUrl);
            } else {
                
                Task task = new Task(title, description, dueDate, priority);
                request.setAttribute("task", task);
                String successUrl = proxyUri + "/success.jsp";
            	response.sendRedirect(successUrl);
            }


	}

}
