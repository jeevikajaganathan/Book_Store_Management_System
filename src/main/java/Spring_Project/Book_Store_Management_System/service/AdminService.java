package Spring_Project.Book_Store_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import Exceptions.AdminNotFoundException;
import Exceptions.AuthorNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Admin;
import Spring_Project.Book_Store_Management_System.repository.AdminRepository;
import Spring_Project.Book_Store_Management_System.repository.AuthorRepository;


public class AdminService {
	@Autowired
	AdminRepository adminRepo;

	public List<Admin> getAdmin() throws AdminNotFoundException {
		List<Admin> ad = adminRepo.findAll();
		if (ad.size() > 0) {
			return ad;
		} else {
			throw new AdminNotFoundException("no record found");

		}

	}
	public Admin getAdminById(int id) throws AdminNotFoundException {
		Optional<Admin> a = adminRepo.findById(id);
		if (a.isPresent()) {
			Admin ad = a.get();
			return ad;
		} else {
			throw new AdminNotFoundException("no record found");
		}

	}
	public Admin deleteAdmin(int id) {
		adminRepo.deleteById(id);
		return null;
	}
	public Admin getAdminByname(String name) throws AdminNotFoundException {
		Optional<Admin> ad = adminRepo.findByName(name);
		if (ad.isPresent()) {
			Admin a = ad.get();
			return a;
		} else {
			throw new AdminNotFoundException("No Records Found");
		}
	}

}



