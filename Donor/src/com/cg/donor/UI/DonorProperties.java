package com.cg.donor.UI;
import java.util.Scanner;

import com.cg.donor.DTO.DonorInfo;
import com.cg.donor.exception.DonorApplicationException;
import com.cg.donor.service.DonorServiceImpl;
import com.cg.donor.service.IDonorService;


public class DonorProperties
{
	static Scanner sc=new Scanner(System.in);
	static DonorInfo details=null;
	static IDonorService Service=new DonorServiceImpl();
	public static void main(String[] args) throws DonorApplicationException 
{
		System.out.println("Information About Donor");
		System.out.println("******************");
		addDonorInfo();
}
	private static void addDonorInfo() throws DonorApplicationException{
		Service=new DonorServiceImpl();
		System.out.println("Enter Donor Name:");
		String name=sc.next();
		
		System.out.println("Enter the Phone Number:");
		String phno=sc.next();
		
		System.out.println("Enter the Address:");
		String add=sc.next();
		
		System.out.println("Enter the Donation Amount:");
		int amount=sc.nextInt();
		
		details=new DonorInfo(name,phno,add,amount);
		Service=new DonorServiceImpl();
		int res=Service.addDonorInfo(details);
		
		System.out.println(res+ " inserted");
		
		if(res==1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}
		}
	
}

