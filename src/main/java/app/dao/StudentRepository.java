package app.dao;

import app.entities.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);

    List<Student> getALL();
}
