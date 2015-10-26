package com.suhael.template;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import javax.servlet.ServletContext;
import java.io.IOException;

public class TemplateGenerator {

    public Template compileTemplate(ServletContext servletContext, String prefix, String template){
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



    public Template compileTemplateFromUrl(ServletContext servletContext, String prefix, String template){
//        TemplateLoader loader = new ServletContextTemplateLoader(servletContext);
//        loader.setPrefix(prefix);
//        Handlebars handlebars = new Handlebars(loader);
//        try {
//            return handlebars.compile(template);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        * Handlebars handlebars = new Handlebars();
//        *
//        * Template template = handlebars.compileInline(URI.create("mytemplate"));
        return null;
    }
}
