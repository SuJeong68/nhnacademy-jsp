package com.nhnacademy.servlet;

import com.nhnacademy.domain.Student;
import com.nhnacademy.domain.StudentRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet(name = "studentRegisterServlet", urlPatterns = "/student/register")
//public class StudentRegisterServlet extends HttpServlet {
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        req.setCharacterEncoding("UTF-8");
//
//        Student student = new Student(
//            req.getParameter("id"),
//            req.getParameter("name"),
//            req.getParameter("gender"),
//            Integer.parseInt(req.getParameter("age")));
//
//        StudentRepository studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");
//        studentRepository.addStudent(student);
//
//        req.setAttribute("view", "redirect:/student/view.do?id=" + student.getId());
////        resp.sendRedirect("/student/view?id=" + student.getId());
//    }
//}

public class StudentRegisterController implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
        Student student = new Student(
                req.getParameter("id"),
                req.getParameter("name"),
                req.getParameter("gender"),
                Integer.parseInt(req.getParameter("age")));

        StudentRepository studentRepository = (StudentRepository) req.getServletContext().getAttribute("studentRepository");
        studentRepository.addStudent(student);

        return "redirect:/student/view.do?id=" + student.getId();
    }
}
