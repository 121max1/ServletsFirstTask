package app.model;

import app.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static Model instance = new Model();

    private List<Student> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(Student student) {
        model.add(student);
    }

    public List<Student> list() {
        return model;
    }

}
