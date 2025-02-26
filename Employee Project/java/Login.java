package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "786313");
			PreparedStatement ps = c.prepareStatement("select * from employee where email=? AND Password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			
				String name1 = rs.getString(1);
				String email1 = rs.getString(2);
				String contact1 = rs.getString(3);
				String dob1 = rs.getString(4);
				String position1 = rs.getString(5);
				String department1 = rs.getString(6);
				String salary1 = rs.getString(7);
				String joining1 = rs.getString(8);
				String address1 = rs.getString(9);
				String city1 = rs.getString(10);
				String state1 = rs.getString(11);
				System.out.println(name1);
				
				if(rs.next())
				{
					req.setAttribute("name",name1 );
					req.setAttribute("email", email1);
					req.setAttribute("contact", contact1);
					req.setAttribute("dob", dob1);
					req.setAttribute("position", position1);
					req.setAttribute("department", department1);
					req.setAttribute("salary", salary1);
					req.setAttribute("joining", joining1);
					req.setAttribute("address", address1);
					req.setAttribute("city", city1);
					req.setAttribute("state",state1);
					
					RequestDispatcher rd=req.getRequestDispatcher("Profile.jsp");
					rd.forward(req, resp);
					
				
				
				}else {
						RequestDispatcher ds1= req.getRequestDispatcher("Registration.html");
						ds1.include(req, resp);
						PrintWriter out=resp.getWriter();
						out.print("<h1>"+"Invalid User"+"</h1>");
						
				}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
