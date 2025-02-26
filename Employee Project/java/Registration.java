package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo")
public class Registration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String contact = req.getParameter("contactno");
		String dob = req.getParameter("dob");
		String position = req.getParameter("position");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");
		String join = req.getParameter("join");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String password = req.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "786313");
			PreparedStatement ps = con.prepareStatement(
					"insert into employee (name, email,contact,dob,position,department,salary,joining,address,city,state,password) values (?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, contact);
			ps.setString(4, dob);
			ps.setString(5, position);
			ps.setString(6, department);
			ps.setString(7, salary);
			ps.setString(8, join);
			ps.setString(9, address);
			ps.setString(10, city);
			ps.setString(11, state);
			ps.setString(12, password);
			ps.executeUpdate();
			con.close();
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, resp);
			
		} catch (Exception e) {

		}
			
	
	}
}
