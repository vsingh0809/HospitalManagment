package com.app.pages;

import static com.app.utils.DBUtils.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.app.dao.PatientDaoImp;
import com.app.entity.Patient;
import com.mysql.cj.x.protobuf.MysqlxConnection.Close;


/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private PatientDaoImp patientdao;
    
  
    @Override
	public void init() throws ServletException {
		
	ServletConfig config=getServletConfig();
	
	try {
		openConnecton(config.getInitParameter("db_url"),config.getInitParameter("user_name"), getInitParameter("password"));
		patientdao=new PatientDaoImp();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw=response.getWriter()) {
			
			
			String email=request.getParameter("email");
			String password=request.getParameter("pass");
			Patient patient=patientdao.signIn(email,password);
			
			
			if(patient==null)
				pw.print("<h5>Invalid Login , Please  <a href='login.html'>Retry</a><h5>");
			else
				pw.print("<h5>successful login<h5>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	
	
	@Override
	public void destroy() {
		
		try {
			closeconnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
