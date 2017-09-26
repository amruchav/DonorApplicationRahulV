package com.cg.donor.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.donor.DTO.DonorInfo;
import com.cg.donor.DTO.DonorInfo;
import com.cg.donor.dbutil.DbUtil;
import com.cg.donor.exception.DonorApplicationException;


public class DonorDaoImpl implements IDonorDAO{
	Connection conn=null;
	public int addDonorInfo(DonorInfo p){
		int result=0;
		try{
			conn=DbUtil.getConnection();
			String insertQuery="Insert into DonorInfo values(donor_id.nextval,?,?,?,?,SYSDATE)";
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setString(1,p.getDonorName());
			ps.setString(2,p.getPhoneNumber());
			ps.setString(3,p.getAddress());
			ps.setInt(4, p.getDonationAmount());
			
			result=ps.executeUpdate();
			System.out.println(result);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	
		
		
	}
	

}


