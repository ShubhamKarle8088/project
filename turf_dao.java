package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.bo.AddTurf;
import com.bo.UserSignup;

public class turf_dao {
	public static Connection Conn() throws SQLException {
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/turf";
			String dbuser="root";
			String dbpass="1234";
		    con = DriverManager.getConnection(dbUrl,dbuser,dbpass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
	public static int signup(UserSignup ob) {
		int status=0;
		
		try {
		Connection con=	turf_dao.Conn();
		String sql="insert into user_signup(name,email,password) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,ob.getName());
		ps.setString(2,ob.getEmail());
		ps.setString(3,ob.getPassword());
		status=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
		
		}
	//LOG IN PAGE METHOD
	public static boolean login(String email,String password) {
		boolean status=false;
		try {
			Connection con=turf_dao.Conn();
			String sql="select * from user_signup where email=? and password=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}
public static List Viewturf() {
		
		List <AddTurf>list= new ArrayList();
		try {
			Connection con= turf_dao.Conn();
			String sql="Select * from turf_details";
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				AddTurf ad=new AddTurf();
				
				ad.setId(rs.getInt(1));
				ad.setGround_Name(rs.getString(2));
				ad.setGround_email(rs.getString(3));
				ad.setGround_capacity(rs.getString(4));
				ad.setGround_address(rs.getString(5));
				list.add(ad);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
public static int bookturf(AddTurf ob) {
	int status=0;
	
	try {
	Connection con=	turf_dao.Conn();
	String sql="insert into book_turf(Ground_Name,Ground_email,Ground_capacity,Ground_Address) values(?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	
	ps.setString(1,ob.getGround_Name());
	ps.setString(2,ob.getGround_email());
	ps.setString(3,ob.getGround_capacity());
	ps.setString(4,ob.getGround_address());
	
	
	status=ps.executeUpdate();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	return status;

	}
public static List booking_history() {
	
	List <AddTurf>list= new ArrayList();
	try {
		Connection con= turf_dao.Conn();
		String sql="Select * from book_turf";
		PreparedStatement ps= con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			AddTurf ad=new AddTurf();
			
			ad.setId(rs.getInt(1));
			ad.setGround_Name(rs.getString(2));
			ad.setGround_email(rs.getString(3));
			ad.setGround_capacity(rs.getString(4));
			ad.setGround_address(rs.getString(5));
			list.add(ad);
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	return list;
}

}
