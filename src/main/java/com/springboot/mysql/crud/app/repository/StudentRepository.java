/**
 * 
 */
package com.springboot.mysql.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mysql.crud.app.model.Student;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findByStudentId(Long studentId);

}
