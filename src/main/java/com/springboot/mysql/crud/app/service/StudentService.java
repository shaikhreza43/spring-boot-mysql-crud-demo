/**
 * 
 */
package com.springboot.mysql.crud.app.service;

import com.springboot.mysql.crud.app.common.Document;
import com.springboot.mysql.crud.app.dto.StudentDto;
import com.springboot.mysql.crud.app.model.Student;

/**
 * @author Shaikh Ahmed Reza
 *
 */
public interface StudentService {

	Document<Student> saveStudent(StudentDto studentDto);

	Document<Student> updateStudent(StudentDto studentDto, Long studentId);

	Document<Student> deleteStudent(Long studentId);

	Document<Student> findStudent(Long studentId);

	Document<Student> findAllStudent();

}
