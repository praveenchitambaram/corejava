package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment {
	private Date app_date;
	private int Id;
	private String patient_name;
	private float fees_collected;
	private String fees_type;
	private int app_Id;

	public int getApp_Id() {
		return app_Id;
	}

	public void setApp_Id(int app_Id) {
		this.app_Id = app_Id;
	}

	public Date getApp_date() {
		return app_date;
	}

	public void setApp_date(Date app_date) {
		this.app_date = app_date;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public float getFees_collected() {
		return fees_collected;
	}

	public void setFees_collected(float fees_collected) {
		this.fees_collected = fees_collected;
	}

	public String getFees_type() {
		return fees_type;
	}

	public void setFees_type(String fees_type) {
		this.fees_type = fees_type;
	}

}
