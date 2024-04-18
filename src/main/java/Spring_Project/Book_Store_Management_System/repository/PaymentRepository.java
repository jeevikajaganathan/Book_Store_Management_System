package Spring_Project.Book_Store_Management_System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Project.Book_Store_Management_System.Model.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

//	List<Payment> findAll();
	

}
