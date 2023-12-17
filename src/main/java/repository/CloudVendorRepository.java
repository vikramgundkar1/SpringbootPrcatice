package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.CloudVendorModel;

public interface CloudVendorRepository extends JpaRepository<CloudVendorModel, String>{

}
