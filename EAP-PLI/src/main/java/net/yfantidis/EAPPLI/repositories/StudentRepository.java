package net.yfantidis.EAPPLI.repositories;

import net.yfantidis.EAPPLI.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
