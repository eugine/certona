package com.sysiq.demo.certona;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CertonaServlet
 */
public class CertonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CertonaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		PrintWriter pw = response.getWriter();
		String str = "<resonance>" + 
					 "<items scheme=\"product_rr\">" +  
						 "<item>" + 
						 "<item-id>21-92403</item-id>" +
						 "</item>" +
						 "<item>" + 
						 "<item-id>21-37394</item-id>" +
						 "</item>" +
						 "<item>" + 
						 "<item-id>21-77470</item-id>" +
						 "</item>" +
						 "<item>" + 
						 "<item-id>21-2867698</item-id>" +
						 "</item>" +
						 "<item>" + 
						 "<item-id>21-2913699</item-id>" +
						 "</item>" +
				     "</items>" + 
				     "<pageid>Overloaded Host</pageid>" + 
				     "<trackingid>363787016598507</trackingid>" + 
				     "</resonance>";
		pw.println(str); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
