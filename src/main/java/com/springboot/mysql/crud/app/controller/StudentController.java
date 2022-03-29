/**
 * 
 */
package com.springboot.mysql.crud.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.crud.app.common.Document;
import com.springboot.mysql.crud.app.dto.StudentDto;
import com.springboot.mysql.crud.app.model.Student;
import com.springboot.mysql.crud.app.service.StudentService;

/**
 * @author Shaikh Ahmed Reza
 *
 */
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<Document<Student>> saveStudent(@Valid @RequestBody StudentDto studentDto) {

		Document<Student> response = studentService.saveStudent(studentDto);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@PutMapping("/update/{studentId}")
	public ResponseEntity<Document<Student>> updateStudent(@Valid @RequestBody StudentDto studentDto,
			@PathVariable(name = "studentId") Long studentId) {

		Document<Student> response = studentService.updateStudent(studentDto, studentId);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@DeleteMapping("/delete/{studentId}")
	public ResponseEntity<Document<Student>> deleteStudent(@PathVariable(name = "studentId") Long studentId) {

		Document<Student> response = studentService.deleteStudent(studentId);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@GetMapping("/find/{studentId}")
	public ResponseEntity<Document<Student>> findStudent(@PathVariable(name = "studentId") Long studentId) {

		Document<Student> response = studentService.findStudent(studentId);

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

	@GetMapping("/findAll")
	public ResponseEntity<Document<Student>> findAllStudent() {

		Document<Student> response = studentService.findAllStudent();

		return ResponseEntity.status(response.getStatusCode()).body(response);
	}

}
