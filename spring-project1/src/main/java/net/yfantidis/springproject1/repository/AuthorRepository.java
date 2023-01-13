package net.yfantidis.springproject1.repository;

import net.yfantidis.springproject1.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Βασικό σύστημα για να παίρνουμε και να προσθέτουμε εγγραφές στην Βάση Δεδομένων
@Repository
public interface AuthorRepository extends JpaRepository<Author, String> /* Αντικείμενο Author τύπος String */{
}
