package com.suhael.rest;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("page")
public class PageResources {

    @GET
    @Path("search")
    @Produces(MediaType.TEXT_HTML)
    public String getHeader() throws IOException {
        //return "<html><head></head><body>hello></body></html>";

        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix("/resources/html");
        loader.setSuffix(".html");
        Handlebars handlebars = new Handlebars(loader);

        Template template = handlebars.compile("template");

        return template.apply("Handlebars.java");
    }
}
