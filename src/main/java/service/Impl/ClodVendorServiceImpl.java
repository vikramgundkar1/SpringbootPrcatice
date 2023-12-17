package service.Impl;

import java.util.List;
import org.springframework.stereotype.Service;

import model.CloudVendorModel;
import repository.CloudVendorRepository;
import service.CloudVendorService;

@Service
public class ClodVendorServiceImpl implements CloudVendorService {

	CloudVendorRepository cloudVendorRepository;

	public ClodVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		super();
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String ceateCloudVendor(CloudVendorModel cloudVendorModel) {
		cloudVendorRepository.save(cloudVendorModel);
		return "Details saved successfully";
	}

	@Override
	public String updateCloudVendor(CloudVendorModel cloudVendorModel) {
		cloudVendorRepository.save(cloudVendorModel);

		return "Details Updated successfully";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {

		return null;
	}

	@Override
	public CloudVendorModel getCloudVendor(String cloudVendorId) {

		return cloudVendorRepository.findById(cloudVendorId).get();
		}

	@Override
	public List<CloudVendorModel> getAllCloudVendor() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}
