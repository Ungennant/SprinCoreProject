package org.serf.project.lesson19.service;

import org.serf.project.lesson19.model.Student;
import org.serf.project.lesson19.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student storeStudent(String firstName, String lastName, int age, MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        Student student = new Student(firstName, lastName, age, fileName, file.getContentType(), file.getBytes());
        return studentRepository.save(student);
    }

    public Student getStudentById(int id){
        Optional<Student> foundedStudent = studentRepository.findById(id);
        return foundedStudent.orElse(null);
    }


}
