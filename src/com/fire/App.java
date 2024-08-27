package com.fire;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;

public class App extends HttpServlet {

    public App() {
        super();
    }
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet App</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Welcome to the Servlet App");
        out.println("</body>");
        out.println("</html>");
    }
}