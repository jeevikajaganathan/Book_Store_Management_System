package Spring_Project.Book_Store_Management_System.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import Spring_Project.Book_Store_Management_System.Model.Author;

@Repository
public interface AuthorRepository   extends JpaRepository<Author,Integer>{


	Optional<Author> findByName(String name);
}

	

	


	

	