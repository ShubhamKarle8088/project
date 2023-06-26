package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.AddTurf;
import com.dao.turf_dao;

/**
 * Servlet implementation class BookHistoryController
 */
@WebServlet("/BookHistoryController")
public class BookHistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookHistoryController() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>");
		out.print("<h2 style=\"color:red; display:inline-block;\">Turf Details</h2>");
		
		List <AddTurf>list=turf_dao.booking_history();
		out.print("<table border='1px solid black'; width='100%'>");
		out.print("<tr> <th> ID </th> <th> GROUND NAME </th> <th> EMAIL </th> <th> CAPACITY</th>"
				+ "<th> ADDRESS </th>  </tr>");
		for(AddTurf ad:list)
			
			
			out.print("<tr><td>"+ad.getId()+"</td><td>"+ad.getGround_Name()+"</td><td>"
					+ad.getGround_email()+"</td><td>"+ad.getGround_capacity()
					+"</td><td>"+ad.getGround_address()+"</td> </tr>");
		out.print("</table>");
	}
	}

