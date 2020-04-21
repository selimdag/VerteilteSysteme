package org.dhbw.service.student.repositories;

import org.dhbw.service.student.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {

}