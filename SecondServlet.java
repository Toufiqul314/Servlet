package com.servlets;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.*;

public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("this is servlet using generic servlet");
        sr1.setContentType("text/html");
        PrintWriter out=sr1.getWriter();
        out.println("<h1>this is my second servlet using generic servlet</h1>");
        
    }
    
}
