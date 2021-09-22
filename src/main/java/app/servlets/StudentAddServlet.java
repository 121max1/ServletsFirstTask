package app.servlets;

import app.dao.impl.StudentRepositoryImpl;
import app.dao.StudentRepository;
import app.entities.Student;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentAddServlet extends HttpServlet {

    @Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String mark = req.getParameter("mark");
        String blockchain = req.getParameter("blockchain");
        boolean blockchainKnowledge = blockchain.equals("true");
        Model model = Model.getInstance();
        model.add(new Student(name, Float.parseFloat(mark),blockchainKnowledge));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }
}
