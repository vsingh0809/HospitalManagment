package com.app.dao;

import java.sql.SQLException;

import com.app.entity.Patient;

public interface PatientDao {
	public Patient signIn(String email, String password) throws SQLException; 
	

}
