package org.serf.project.shared;

import org.serf.project.model.Student;

import java.util.List;

public interface AbstractCRUD<T>{

    void create(Student student);

    void delete(int id);

    void update(Student student);

    Student readStudentById(int id);

    List<Student> readAll();
}
