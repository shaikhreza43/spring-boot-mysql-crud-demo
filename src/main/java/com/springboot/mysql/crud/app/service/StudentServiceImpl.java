package com.springboot.mysql.crud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.mysql.crud.app.common.Document;
import com.springboot.mysql.crud.app.dto.StudentDto;
import com.springboot.mysql.crud.app.model.Student;
import com.springboot.mysql.crud.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Document<Student> saveStudent(StudentDto studentDto) {

		Document doc = new Document<>();

		try {

			Student student = new Student();
			student.setStudentAddress(studentDto.getStudentAddress());
			student.setStudentAge(studentDto.getStudentAge());
			student.setStudentEmail(studentDto.getStudentEmail());
			student.setStudentMobile(studentDto.getStudentMobile());
			student.setStudentName(studentDto.getStudentName());

			Student saved = studentRepository.save(student);

			doc.setData(saved);
			doc.setMessage("Student Details Saved Successfully");
			doc.setStatusCode(201);

		} catch (Exception ex) {

			doc.setData(ex.getMessage());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;

	}

	@Override
	public Document<Student> updateStudent(StudentDto studentDto, Long studentId) {
		Document doc = new Document<>();

		try {

			// Get Student By Id
			Student existingStudent = studentRepository.findByStudentId(studentId);

			if (existingStudent == null) {
				throw new NullPointerException("No Student Found with the Id Provided");
			}

			existingStudent.setStudentAddress(studentDto.getStudentAddress());
			existingStudent.setStudentAge(studentDto.getStudentAge());
			existingStudent.setStudentEmail(studentDto.getStudentEmail());
			existingStudent.setStudentMobile(studentDto.getStudentMobile());
			existingStudent.setStudentName(studentDto.getStudentName());

			Student updated = studentRepository.save(existingStudent);

			doc.setData(updated);
			doc.setMessage("Student Details Updated Successfully");
			doc.setStatusCode(200);

		} catch (Exception ex) {

			doc.setData(ex.getMessage());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

	@Override
	public Document<Student> deleteStudent(Long studentId) {
		Document doc = new Document<>();

		try {

			// Get Student By Id
			Student existingStudent = studentRepository.findByStudentId(studentId);

			if (existingStudent == null) {
				throw new NullPointerException("No Student Found with the Id Provided");
			}

			studentRepository.delete(existingStudent);

			doc.setData("Deleted");
			doc.setMessage("Student Details Deleted Successfully");
			doc.setStatusCode(200);

		} catch (Exception ex) {

			doc.setData(ex.getMessage());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

	@Override
	public Document<Student> findStudent(Long studentId) {
		Document doc = new Document<>();

		try {

			// Get Student By Id
			Student existingStudent = studentRepository.findByStudentId(studentId);

			if (existingStudent == null) {
				throw new NullPointerException("No Student Found with the Id Provided");
			}

			doc.setData(existingStudent);
			doc.setMessage("Student Details Fetched Successfully");
			doc.setStatusCode(200);

		} catch (Exception ex) {

			doc.setData(ex.getMessage());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

	@Override
	public Document<Student> findAllStudent() {

		Document doc = new Document<>();

		try {

			// Get Student By Id
			List<Student> listOfAllStudents = studentRepository.findAll();

			if (listOfAllStudents.isEmpty()) {
				throw new NullPointerException("No Students Foundin DB");
			}

			doc.setData(listOfAllStudents);
			doc.setMessage("All Students Fetched Successfully");
			doc.setStatusCode(200);

		} catch (Exception ex) {

			doc.setData(ex.getMessage());
			doc.setMessage(ex.getLocalizedMessage());
			doc.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		}

		return doc;
	}

}
