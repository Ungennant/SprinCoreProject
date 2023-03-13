package org.serf.project.dao;

import org.serf.project.model.Student;
import org.serf.project.shared.AbstractCRUD;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements AbstractCRUD<Student> {

    private List<Student> students = new ArrayList<>();

    @Override
    public void create(Student student) {
        students.add(student);
    }

    @Override
    public void delete(int id) {
        students.remove(id);
    }

    @Override
    public void update(Student student) {
        students.remove(student.getId());
        students.add(student);
    }

    @Override
    public Student readStudentById(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> readAll() {
        return students;
    }
}
