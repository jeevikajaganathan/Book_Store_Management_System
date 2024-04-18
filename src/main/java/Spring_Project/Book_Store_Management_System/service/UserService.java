package Spring_Project.Book_Store_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import Spring_Project.Book_Store_Management_System.Model.Users;
import Spring_Project.Book_Store_Management_System.repository.UserRepository;

public class UserService {
	@Autowired
	UserRepository  userrepo;

	public List<Users> getadmin() {
		// TODO Auto-generated method stub
		return null;
	}

	public Users getuserId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users createUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public Users updateUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users deleteUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
