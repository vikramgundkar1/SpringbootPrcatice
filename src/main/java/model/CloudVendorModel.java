package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class CloudVendorModel {
	
	private String vendorId;
	private String vendorName;
	private String vendorNumber;
	private String vendorAddress;
	
	public CloudVendorModel() {
		super();
	}

	public CloudVendorModel(String vendorId, String vendorName, String vendorNumber, String vendorAddress) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorNumber = vendorNumber;
		this.vendorAddress = vendorAddress;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorNumber() {
		return vendorNumber;
	}

	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	
	

}
