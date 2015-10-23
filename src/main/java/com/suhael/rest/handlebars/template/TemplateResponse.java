package com.suhael.rest.handlebars.template;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;
import com.suhael.rest.ResponseBuilder;

import javax.servlet.ServletContext;
import java.io.IOException;

public abstract class TemplateResponse extends ResponseBuilder {

    protected static final String TEMPLATE_PREFIX_PATH = "/resources/template/core";

    public Template createTemplate(ServletContext servletContext, String prefix, String template){
        TemplateLoader loader = new ServletContextTemplateLoader(servletContext);
        loader.setPrefix(prefix);
        Handlebars handlebars = new Handlebars(loader);
        try {
            return handlebars.compile(template);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected abstract Object generateContext();
}
