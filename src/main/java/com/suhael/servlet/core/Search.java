package com.suhael.servlet.core;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("page/core/search")
public class Search extends HttpServlet {

    private static final String VIEW_PATH = "/views/";

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {

        try {
            request.getRequestDispatcher(VIEW_PATH + "search.jsp").include(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

}