package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("fullname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String degree = request.getParameter("degree");
        String branch = request.getParameter("branch");
        String examcenter = request.getParameter("examcenter");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>GATE Registration Successful!</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Phone: " + phone + "</p>");
        out.println("<p>Degree: " + degree + "</p>");
        out.println("<p>Branch: " + branch + "</p>");
        out.println("<p>Exam Center: " + examcenter + "</p>");
    }
}