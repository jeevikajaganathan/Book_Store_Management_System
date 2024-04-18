package Spring_Project.Book_Store_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootTask.SpringBootTask.model.StudentNotFoundException;

import Exceptions.AuthorNotFoundException;
import Spring_Project.Book_Store_Management_System.Model.Author;
import Spring_Project.Book_Store_Management_System.repository.AuthorRepository;

@Service
public class AuthorService {	
		@Autowired
		AuthorRepository authorRepo;

		public List<Author> getAuthor() throws AuthorNotFoundException {
			List<Author> au = authorRepo.findAll();
			if (au.size() > 0) {
				return au;
			} else {
				throw new AuthorNotFoundException("no record found");

			}

		}

		public Author getAuthorById(int id) throws AuthorNotFoundException {
			Optional<Author> a = authorRepo.findById(id);
			if (a.isPresent()) {
				Author au = a.get();
				return au;
			} else {
				throw new AuthorNotFoundException("no record found");
			}

		}

		
		public Author addAuthor(Author author) {
			Author a = authorRepo.save(author);
			return a;
		}

		public Author updateAuthor(int id) throws AuthorNotFoundException {
			Optional<Author> au = authorRepo.findById(id);
			if (au.isPresent()) {

				Author a = au.get();
				if (a.getAuthorname() != null) {
					a.setAuthorname(a.getAuthorname());
				}
				
                 authorRepo.save(a);
				return a;
			}else {
				throw new AuthorNotFoundException("no record found");
				} 
		}

		public Author deleteAuthor(int id) {
			authorRepo.deleteById(id);
			return null;
		}

//		public List<Author> findAllByOrdernameDesc() throws AuthorNotFoundException {
//			List<Author> au = authorRepo.findAllByOrderBynameDesc();
//			if (au.size() > 0) {
//				return au;
//			} else {
//				throw new AuthorNotFoundException("no records found");
//			}
//		}

		public Author getByname(String name) throws AuthorNotFoundException {
			Optional<Author> au = authorRepo.findByName(name);
			if (au.isPresent()) {
				Author a = au.get();
				return a;
			} else {
				throw new AuthorNotFoundException("No Records Found");
			}
		}

	}





