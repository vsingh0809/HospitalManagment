package com.app.entity;

public class Doctor {
	 private int doctorID;
	    private String firstName;
	    private String lastName;
	    private String specialization;
	    private String phoneNumber;
	    private String gender;
	    private String Password;
	    private String Email;
	    
	    
	    
	   


		public Doctor(int doctorID, String firstName, String lastName, String specialization, String phoneNumber,
				String gender, String password, String email) {
			this.doctorID = doctorID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.specialization = specialization;
			this.phoneNumber = phoneNumber;
			this.gender = gender;
			Password = password;
			Email = email;
		}



		@Override
		public String toString() {
			return "Doctor [doctorID=" + doctorID + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", specialization=" + specialization + ", phoneNumber=" + phoneNumber + ", gender=" + gender
					+ "]";
		}
 
		


		public String getPassword() {
			return Password;
		}



		public String getEmail() {
			return Email;
		}



		public int getDoctorID() {
			return doctorID;
		}



		public String getFirstName() {
			return firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public String getSpecialization() {
			return specialization;
		}



		public String getPhoneNumber() {
			return phoneNumber;
		}



		public String getGender() {
			return gender;
		}
		

}
