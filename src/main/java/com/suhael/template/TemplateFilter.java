package com.suhael.template;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jknack.handlebars.Template;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

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
        String html = templateGenerator.generateHTML(template, getTemplateData());
        PrintWriter out = response.getWriter();
        out.print(html);
        return out;
    }

    private Map getTemplateData() throws IOException {
        Map<Object, Object> values = new HashMap<>();

        ObjectMapper mapper = new ObjectMapper();

        //Map<Object, Object> menu = mapper.readValue(new URL("http://localhost:7001/pageTemplate_war_exploded/rest/menu/v1"), new TypeReference<Map<Object, Object>>(){});

        values.put("title", "suhael");
        return values;
    }
}
