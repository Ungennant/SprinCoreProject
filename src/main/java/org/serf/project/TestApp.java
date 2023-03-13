package org.serf.project;

import org.serf.project.dao.StudentDAO;
import org.serf.project.model.SpringConfig;
import org.serf.project.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student student = context.getBean("student", Student.class);
        StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

        studentDAO.create(student);
        Student tempStudent = studentDAO.readStudentById(student.getId());
        System.out.println(tempStudent);

        studentDAO.update(student);
        studentDAO.delete(0);
        System.out.println(studentDAO.readAll());
    }
}
