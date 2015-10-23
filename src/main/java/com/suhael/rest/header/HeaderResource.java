package com.suhael.rest.header;

import com.suhael.rest.ResponseBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("header")
public class HeaderResource {

    @GET
    @Path("v1")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHeaderData() throws IOException {
        return ResponseBuilder.returnJsonResponse(new Header());
    }

    private class Header {
        private String title = "site title";

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
