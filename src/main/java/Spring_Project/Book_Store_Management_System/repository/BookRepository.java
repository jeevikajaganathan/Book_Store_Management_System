package Spring_Project.Book_Store_Management_System.repository;

import java.awt.print.Book;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {

	Optional<Book> findById(int id);

	Optional<Book> findByTitle(String title);

}
