package com.cg.donor.service;

import com.cg.donor.DTO.DonorInfo;
import com.cg.donor.dao.DonorDaoImpl;
import com.cg.donor.dao.IDonorDAO;
import com.cg.donor.dao.DonorDaoImpl;

public class DonorServiceImpl implements IDonorService{
	DonorDaoImpl dao=null;

	
	public int addDonorInfo(DonorInfo p) {
		dao=new DonorDaoImpl();
		return dao.addDonorInfo(p);
		
	}

}
