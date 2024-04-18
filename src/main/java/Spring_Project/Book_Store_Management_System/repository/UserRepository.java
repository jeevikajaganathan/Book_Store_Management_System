package Spring_Project.Book_Store_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Project.Book_Store_Management_System.Model.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {

}
