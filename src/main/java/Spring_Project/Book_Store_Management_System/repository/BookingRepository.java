package Spring_Project.Book_Store_Management_System.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Spring_Project.Book_Store_Management_System.Model.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {
	Optional<Booking> findById(int id);

}
