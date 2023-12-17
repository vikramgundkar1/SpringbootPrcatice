package controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import model.CloudVendorModel;
import service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

	CloudVendorService cloudVendorService;

	public CloudVendorController(CloudVendorService cloudVendorService) {
		super();
		this.cloudVendorService = cloudVendorService;
	}
	
	

	@GetMapping("{vendorId}")
	public CloudVendorModel getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.getCloudVendor(vendorId);
		
		//return new CloudVendorModel("C1", "VendorNmae1", "Vendor1", "XXXXXXX");
		
	}

	@PostMapping
	public String creatCloudVendorDetails(@RequestBody CloudVendorModel cloudVendorModel) {
		
		return cloudVendorService.ceateCloudVendor(cloudVendorModel);
		//return "Cloud Vendor details created successfully";
	}

	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendorModel cloudVendorModel) {
		
		return cloudVendorService.updateCloudVendor(cloudVendorModel);
		
//		this.cloudVendorModel = cloudVendorModel;
//		return "Cloud Vendor details updated successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudVendorService.deleteCloudVendor(vendorId);
		
	}

//	public List<cloudVendorModel> getAllVendorDetails()
//	{
//		return List<cloudVendorModel> new ({"C1", "VendorNmae1", "Vendor1", "XXXXXXX"},{"C1", "VendorNmae1", "Vendor1", "XXXXXXX"});
//	}

}
