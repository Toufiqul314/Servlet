package com.practices;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ReqisterServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to register Servlet</h2>");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("User_geender");
        String course = request.getParameter("user_course");

        String cond = request.getParameter("condition");
        //out.println("<h3>" + cond + "</h3>");
        if (cond != null) {
            if (cond.equals("checked")) {
                out.println("<h2>Name :" + name + "</h2>");
                out.println("<h2>password :" + password + "</h2>");
                out.println("<h2>Email :" + email + "</h2>");
                out.println("<h2>Gender :" + gender + "</h2>");
                out.println("<h2>Course :" + course + "</h2>");
            } else {
                out.println("<h2>You hava not accepted terms and condition</h2>");
            }
        } else {
            out.println("<h2>You hava not accepted terms and condition</h2>");
        }

    }
}
