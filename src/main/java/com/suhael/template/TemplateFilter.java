package com.suhael.template;

import com.github.jknack.handlebars.Template;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "TemplateFilter",
        urlPatterns = {"page/*"})
public class TemplateFilter implements Filter {

    //private static final String TEMPLATE_NAME = "client_side_scripts";
    private static final String TEMPLATE_NAME = "cmd_template";

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        writeTemplate(servletResponse);
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }

    private PrintWriter writeTemplate(ServletResponse response) throws IOException {
        TemplateGenerator templateGenerator = new TemplateGenerator(filterConfig.getServletContext());
        Template template = templateGenerator.compileTemplate(TEMPLATE_NAME);
        String html = templateGenerator.generateHTML(template, new String());
        PrintWriter out = response.getWriter();
        out.print(html);
        return out;
    }
}
