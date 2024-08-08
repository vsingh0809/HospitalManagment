package com.app.entity;

import java.sql.Date;

public class Patient {
	 private int patientID;
	    private String firstName;
	    private String lastName;
	    private String Pgender;
	    private Date dateOfBirth;
	    private String phoneNumber;
	    private String email;
	    private String address;
	    private String Password;
	    
	    
	    
		public Patient(int patientID, String firstName, String lastName, String pgender, Date dateOfBirth,
				String phoneNumber, String email, String address, String password) {
			this.patientID = patientID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.Pgender = pgender;
			this.dateOfBirth = dateOfBirth;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.address = address;
			this.Password = password;
		}


		@Override
		public String toString() {
			return "Patient [patientID=" + patientID + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", Pgender=" + Pgender + ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber
					+ ", email=" + email + ", address=" + address + "]";
		}


		public int getPatientID() {
			return patientID;
		}


		public String getFirstName() {
			return firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public String getPgender() {
			return Pgender;
		}


		public Date getDateOfBirth() {
			return dateOfBirth;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public String getEmail() {
			return email;
		}


		public String getAddress() {
			return address;
		}


		public String getPassword() {
			return Password;
		}


		public Patient signIn(String email2, String password2) {
			// TODO Auto-generated method stub
			return null;
		}


		
}
