package com.suhael.servlet.cmd;

import com.github.jknack.handlebars.Template;
import com.suhael.template.TemplateGenerator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cmd/search")
public class Search extends HttpServlet {

    private static final String TEMPLATE_NAME = "cmd_template";
    private static final String VIEW_PATH = "/views/";

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {

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

    private PrintWriter writeTemplate(HttpServletResponse response) throws IOException {
        TemplateGenerator templateGenerator = new TemplateGenerator(getServletContext());
        Template template = templateGenerator.compileTemplate(TEMPLATE_NAME);
        String html = templateGenerator.generateHTML(template, new String());
        PrintWriter out = response.getWriter();
        out.print(html);
        return out;
    }

}