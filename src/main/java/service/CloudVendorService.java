package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import model.CloudVendorModel;
import repository.CloudVendorRepository;

public interface CloudVendorService {
	
	public String ceateCloudVendor(CloudVendorModel cloudVendorModel);
	public String updateCloudVendor(CloudVendorModel cloudVendorModel);
	public String deleteCloudVendor(String cloudVendorId);
	public CloudVendorModel getCloudVendor(String cloudVendorId);
	public List<CloudVendorModel> getAllCloudVendor();
	
	
	
	
	
	
	

}
