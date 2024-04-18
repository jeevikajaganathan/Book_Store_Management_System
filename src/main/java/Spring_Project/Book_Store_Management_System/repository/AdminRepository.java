package Spring_Project.Book_Store_Management_System.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Project.Book_Store_Management_System.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{
	Optional<Admin> findByName(String name);

}
