package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Doctor;

public class DoctorDao 
{
	private static Connection getConnection()
	{
		Connection con = null;
		String drivername = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "praveen2299";
		try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
   		try {
   				con = DriverManager.getConnection(url,user,pwd);
   			} catch (SQLException e) {
   				e.printStackTrace();
   			}
   			return con;
	}
	
	public static java.sql.Date convertToSqlDate(java.util.Date date)
	{
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}	
	public static int insertDoctor(Doctor newdoc)
	{
		String insertquery = "insert into doctor(Id,Name,Dob,Spaciality ,city,phone_no,standard_fees) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1,newdoc.getId());
			ps.setString(2,newdoc.getName());
			ps.setDate(3,convertToSqlDate(newdoc.getDob()));
			ps.setString(4, newdoc.getSpaciality());
			ps.setString(5,newdoc.getCity());
			// Convert java.util.Date to java.sql.Date
			ps.setLong(6,newdoc.getPhone_no());
			ps.setDouble(7,newdoc.getStandard_fees());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	public static int updateDoctor(Doctor newdoc)
	{
		String updatequery = "update doctor set Name=?,Dob=?,Spaciality =?,city=?,phone_no=?,standard_fees=? where Id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7,newdoc.getId());
			ps.setString(1,newdoc.getName());
			ps.setDate(2,convertToSqlDate(newdoc.getDob()));
			ps.setString(3, newdoc.getSpaciality());
			ps.setString(4,newdoc.getCity());
			ps.setLong(5,newdoc.getPhone_no());
			ps.setFloat(6,newdoc.getStandard_fees());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	public static int deleteDoctor(int id)
	{
		String deletequery = "delete doctor where Id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1,id);
			rows = ps.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}
	public static Doctor getDoctorByID(int id)
	{
		Doctor doc = null;
		String selectquery = "select Id,Name,Dob,Spaciality ,city,phone_no,standard_fees from doctor where Id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1,id);
			rs = ps.executeQuery();
			doc = new Doctor();
			while(rs.next())
			{
				doc.setId(rs.getInt(1));
				doc.setName(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpaciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getFloat(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return doc;		
	}
	public static List<Doctor> getAllDoctor()
	{
		List<Doctor> listofDoctors = new ArrayList<Doctor>();
		Doctor doc = null;
		String selectquery = "select Id,Name,Dob,Spaciality ,city,phone_no,standard_fees from doctor";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while(rs.next())
			{
				doc = new Doctor();
				doc.setId(rs.getInt(1));
				doc.setName(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpaciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getInt(7));
				listofDoctors.add(doc);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return listofDoctors;
	}
}