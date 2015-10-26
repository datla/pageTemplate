package com.suhael.servlet.core;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.FileTemplateLoader;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.suhael.servlet.ServletHelper;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;

@WebServlet("/core/search")
public class Search extends HttpServlet {

    protected static final String TEMPLATE_PREFIX_PATH = "/resources/template/core";
    private static final String TEMPLATE_NAME = "core_template";

    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) {

        Template template = createTemplate(getServletContext(), TEMPLATE_PREFIX_PATH, TEMPLATE_NAME);
        try {
            String html = template.apply(new String());
            PrintWriter out = response.getWriter();
            out.print(html);
            out.flush();
            request.getRequestDispatcher("./views/search/index.jsp").include(request, response);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    public Template createTemplate(ServletContext servletContext, String prefix, String template){
        //TemplateLoader loader = new ServletContextTemplateLoader(servletContext);
        TemplateLoader loader = new FileTemplateLoader("http://localhost:7001/pageTemplate_war_exploded/resources/template/core");
        //loader.setPrefix(prefix);
        Handlebars handlebars = new Handlebars(loader);
        try {
            return handlebars.compile(template);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}