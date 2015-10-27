package com.suhael.template;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("page/*")
public class TemplateServlet extends HttpServlet {

    private static final String VIEW_PATH = "/views/";

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {

        String project = request.getParameter("project");
        String page = request.getParameter("page");

        try {
            PrintWriter out = writeTemplate(response);
            out.flush();
            request.getRequestDispatcher(VIEW_PATH + "search.jsp").include(request, response);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    private PrintWriter writeTemplate(ServletResponse response) throws IOException {
        String html = TemplateFactory.getTemplate("cmd");
        PrintWriter out = response.getWriter();
        out.print(html);
        return out;
    }
}
