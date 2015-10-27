package com.suhael.template;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import javax.servlet.ServletContext;
import java.io.IOException;

public class TemplateGenerator {

    private static final String TEMPLATE_PREFIX_PATH = "/resources/template/cmd";
    private ServletContext servletContext;
    private Handlebars handlebars;

    public TemplateGenerator(ServletContext servletContext){
        this.servletContext = servletContext;
        TemplateLoader templateLoader = getTemplateLoader();
        this.handlebars = new Handlebars(templateLoader);
    }

    public Template compileTemplate(String template) throws IOException {
        return handlebars.compile(template);
    }

    public String generateHTML(Template template, Object context) throws IOException {
        return template.apply(context);
    }

    private TemplateLoader getTemplateLoader(){
        TemplateLoader loader = new ServletContextTemplateLoader(servletContext);
        loader.setPrefix(TEMPLATE_PREFIX_PATH);
        return loader;
    }
}
