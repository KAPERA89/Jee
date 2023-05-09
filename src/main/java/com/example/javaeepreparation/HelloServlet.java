package com.example.javaeepreparation;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet",
        value = "/hello-servlet")

public class HelloServlet extends HttpServlet {


    public void init(ServletConfig config) throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    public void destroy() {
    }
}