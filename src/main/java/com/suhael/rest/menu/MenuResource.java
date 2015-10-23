package com.suhael.rest.menu;

import com.suhael.rest.ResponseBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Path("menu")
public class MenuResource {

    @GET
    @Path("v1")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMenuData() throws IOException {
        return ResponseBuilder.returnJsonResponse(new Menu());
    }

    private class Menu {
        private List<String> menuItems = Arrays.asList("home", "about", "contact");

        public List<String> getMenuItems() {
            return menuItems;
        }

        public void setMenuItems(List<String> menuItems) {
            this.menuItems = menuItems;
        }
    }
}
