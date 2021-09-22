package app.dao.impl;

import app.dao.StudentRepository;
import app.entities.Student;

import java.io.*;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {

    private static List<Student> students;
    public  StudentRepositoryImpl()
    {
        try {
            File file = new File("/Users/prologistic/file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
                String[] wordsInRow = line.split(" ");
                String fullName = wordsInRow[0] + " " + wordsInRow[1] + " " + wordsInRow[2];
                float mark = 0;
                try {
                     mark = Float.parseFloat(wordsInRow[3]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                boolean isBlockchainKnown = wordsInRow[4].equals("+");
                students.add(new Student(fullName,mark,isBlockchainKnown));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getALL() {
        return students;
    }
}
