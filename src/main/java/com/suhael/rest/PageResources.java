package com.suhael.rest;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ServletContextTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

import static javax.ws.rs.core.Response.ok;

@Path("page")
public class PageResources {

    @Context
    private ServletContext servletContext;

    @GET
    @Path("search")
    @Produces(MediaType.TEXT_HTML)
    public Response getHeader() throws IOException {
        String content = "hello world";
        return responseHTML(createHandlebarsTemplate().apply(content));
    }

    private Template createHandlebarsTemplate() throws IOException {
        TemplateLoader loader = new ServletContextTemplateLoader(servletContext);
        loader.setPrefix("/resources/template/core");
        Handlebars handlebars = new Handlebars(loader);
        return handlebars.compile("core_template");
    }

    private static Response responseHTML(Object entity) {
        return response(entity, MediaType.TEXT_HTML);
    }

    private static Response response(Object entity, String mediaType) {
        return ok(entity)
                .header("Content-Type", mediaType)
                .build();
    }
}
