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

@Path("cmd")
public class CmdResources extends TemplateResponse {

    private static final String TEMPLATE_NAME = "cmd_template";

    @Context
    private ServletContext servletContext;

//    private ObjectMapper objectMapper = new ObjectMapper();

    @GET
    @Path("search")
    @Produces(MediaType.TEXT_HTML)
    public Response getHeader() throws IOException {
        return returnHTMLResponse(createTemplate(servletContext, TEMPLATE_PREFIX_PATH, TEMPLATE_NAME).apply(generateContext()));
    }

    @Override
    protected Object generateContext() {
//        try {
//            return getObjectFromUrl("http://localhost:7001/pageTemplate_war_exploded/rest/menu/v1");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return null;
    }
    
}
