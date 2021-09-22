package app.servlets;

import app.entities.Student;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StudentBlockchainServlet  extends  HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model model = Model.getInstance();
        List<Student> students = model.list().stream().filter(Student::isBlockChainKnown).collect(Collectors.toList());
        req.setAttribute("studentList", students);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/blockchain.jsp");
        requestDispatcher.forward(req, resp);
    }
}
