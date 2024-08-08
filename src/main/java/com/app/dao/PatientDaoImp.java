package com.app.dao;

import static com.app.utils.DBUtils.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.entity.Patient;


public class PatientDaoImp implements PatientDao {
	private Connection cn;
	private PreparedStatement ps1;

	public PatientDaoImp() throws SQLException {
		cn =getConnection();
		System.out.println("start query");
		ps1= cn.prepareStatement("select * from Patient where email=? and password=?");
	}

	@Override
	public Patient signIn(String email, String password) throws SQLException {
		ps1.setString(1, email);
		ps1.setString(2, password);
		
		try(ResultSet rs=ps1.executeQuery()) {
			while(rs.next())
			return new Patient(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), email, password);
		} 
		return null;
	}

	public void cleanUp() throws SQLException {
		System.out.println("user dao cleaned up");
		if (ps1 != null)
			ps1.close();
}
}