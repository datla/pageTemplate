package com.suhael.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {
        try {
            ServletHelper.renderView(request, response, "./views/search/index.jsp");
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}