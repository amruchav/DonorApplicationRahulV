package com.cg.donor.DTO;

import java.time.LocalDate;

public class DonorInfo {
private String DonorId;
private String DonorName;
private String PhoneNumber;
private String Address;
private int DonationAmount;
private LocalDate DonationDate;
public String getDonorId() {
	return DonorId;
}
public void setDonorId(String donorId) {
	DonorId = donorId;
}
public String getDonorName() {
	return DonorName;
}
public void setDonorName(String donorName) {
	DonorName = donorName;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getDonationAmount() {
	return DonationAmount;
}
public void setDonationAmount(int donationAmount) {
	DonationAmount = donationAmount;
}
public LocalDate getDonationDate() {
	return DonationDate;
}
public void setDonationDate(LocalDate donationDate) {
	DonationDate = donationDate;
}
public DonorInfo(String donorName, String phoneNumber, String address,
		int donationAmount) {
	super();
	DonorName = donorName;
	PhoneNumber = phoneNumber;
	Address = address;
	DonationAmount = donationAmount;
}

public DonorInfo()
{
	
}
}
