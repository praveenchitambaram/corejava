package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointment
{
	public static void testInsertAppointments() 
	{
        Appointment newapp = new Appointment();
        newapp.setApp_Id(1);
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate =c1.getTime();
        newapp.setApp_date(newDate);
        newapp.setApp_Id(102);
        newapp.setPatient_name("kumutha");
        newapp.setFees_collected(6000F);
        newapp.setFees_type("high");
        int result = AppointmentDao.insertAppointment(newapp);
        System.out.println(result);
        
    }
    public static void testUpdateAppointment()
    {
        Appointment oldAppointment = AppointmentDao.getAppoitmentById(1);
        System.out.println(oldAppointment.getApp_date()+" "+oldAppointment.getPatient_name()+" "+oldAppointment.getFees_collected());
        Calendar c1 = Calendar.getInstance();
        java.util.Date newDate =c1.getTime();
        oldAppointment.setApp_date(newDate);
        oldAppointment.setApp_Id(103);
        oldAppointment.setPatient_name("Juji");
        oldAppointment.setFees_collected(5000);
        int result = AppointmentDao.updateAppointment(oldAppointment);
        System.out.println(result);
        
    }
    public static void testGetAllAppointment() 
    {

		try {
			List<Appointment> allAppointments = AppointmentDao.getAllAppointment();
			Iterator<Appointment> docIterator = allAppointments.iterator();
			while(docIterator.hasNext())
			{
				Appointment app = docIterator.next();
				System.out.println("Appointment ID :" + app.getApp_Id() + "\n" + "Doctor ID :" + app.getApp_Id() + "\n" + "Patient name :" + app.getPatient_name());
				System.out.println("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public static void testGetAppointmentsById() 
    {
    Appointment app = AppointmentDao.getAppoitmentById(2);
    System.out.println(app.getApp_Id()+" "+app.getPatient_name()+" "+app.getFees_collected());
    }
    public static void testDeleteAppointments() 
    {
        int result = AppointmentDao.deleteAppointment(1);
        System.out.println(result);
    }

}
