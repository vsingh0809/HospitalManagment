package com.app.entity;


import java.time.LocalDate;

public class Appointment {
	private int appointmentID;
    private int doctorID;
    private int patientID;
    private LocalDate appointmentDate;
    private LocalDate appointmentTime;
	public Appointment(int appointmentID, int doctorID, int patientID, LocalDate appointmentDate,
			LocalDate appointmentTime) {
		this.appointmentID = appointmentID;
		this.doctorID = doctorID;
		this.patientID = patientID;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
	}
	public int getAppointmentID() {
		return appointmentID;
	}
	public int getDoctorID() {
		return doctorID;
	}
	public int getPatientID() {
		return patientID;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public LocalDate getAppointmentTime() {
		return appointmentTime;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentID=" + appointmentID + ", doctorID=" + doctorID + ", patientID=" + patientID
				+ ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime + "]";
	}
 
	

}
