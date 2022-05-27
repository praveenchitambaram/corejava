package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentUi 
{
	public static void addNewAppointments()
	{
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		app.setApp_Id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Doctor id:");
		String doc_Id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setApp_Id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		float fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees fees_type:");
		String fees_type = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_type);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_type(fees_type);
		int result = AppointmentDao.insertAppointment(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetailsById() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Appointment doc = AppointmentDao.getAppoitmentById(app_id);
		System.out.println("Appointment id:" + doc.getApp_Id());
		System.out.println("Appointment date:" + doc.getApp_date());
		System.out.println("Doctor id:" + doc.getApp_Id());
		System.out.println("patient name"+doc.getPatient_name());
		System.out.println("fees collected:" + doc.getFees_collected());
		System.out.println("fees catagery:" + doc.getFees_type());
		sc.close();
	}
	public static void ViewAllAppointmentDetails() 
	{
		List<Appointment> applist =AppointmentDao.getAllAppointment();
		Iterator<Appointment> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointment app=appItr.next();
			System.out.println(
					"\n"+"app id:"+app.getApp_Id()+
					"\n"+"Appointment date:" + app.getApp_date()+
					"\n"+"Doctor id:" + app.getApp_Id()+
					"\n"+"patient name"+app.getPatient_name()+
					"\n"+"fees collected:" + app.getFees_collected()+
					"\n"+"fees catagery:" + app.getFees_type());
		}
	}
	public static void updateAppointmentDetails() 
	{
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setApp_Id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_name);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setApp_Id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		float fees=Integer.parseInt(fees_collected);
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_type(fees_cat);
		int result = AppointmentDao.updateAppointment(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = AppointmentDao.deleteAppointment(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
}
