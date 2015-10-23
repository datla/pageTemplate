package com.suhael.rest.pages;

import com.suhael.rest.handlebars.template.TemplateResponse;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("core")
public class CoreResources extends TemplateResponse {

    private static final String TEMPLATE_NAME = "core_template";

    @Context
    private ServletContext servletContext;

    @GET
    @Path("search")
    @Produces(MediaType.TEXT_HTML)
    public Response getHeader() throws IOException {
        return returnHTMLResponse(createTemplate(servletContext, TEMPLATE_PREFIX_PATH, TEMPLATE_NAME).apply(generateContext()));
    }

    protected Object generateContext(){

//        JsonReader jsonReader = Json.createReader(...);
//        JsonObject object = jsonReader.readObject();
//        jsonReader.close();

        return new Object();
    }
}
