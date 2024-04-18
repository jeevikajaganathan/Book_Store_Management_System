package Spring_Project.Book_Store_Management_System.repository;

import java.awt.print.Book;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Project.Book_Store_Management_System.Model.Canceled;

public interface CanceledRepository extends JpaRepository<Canceled,Integer> {

	List<Canceled> findAll();


}
