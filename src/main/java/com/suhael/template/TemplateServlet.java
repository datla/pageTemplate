package com.suhael.template;

import com.github.jknack.handlebars.Template;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("page/core/search")
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
        TemplateGenerator templateGenerator = new TemplateGenerator(getServletContext());
        Template template = templateGenerator.compileTemplate("cmd_template");
        String html = templateGenerator.generateHTML(template, getTemplateData());
        PrintWriter out = response.getWriter();
        out.print(html);
        return out;
    }

    private Map getTemplateData() throws IOException {
        Map<Object, Object> values = new HashMap<>();

        //ObjectMapper mapper = new ObjectMapper();

        //Map<Object, Object> menu = mapper.readValue(new URL("http://localhost:7001/pageTemplate_war_exploded/rest/menu/v1"), new TypeReference<Map<Object, Object>>(){});

        values.put("title", "suhael");
        return values;
    }
}
