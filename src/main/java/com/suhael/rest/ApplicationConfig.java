package com.suhael.rest;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class ApplicationConfig extends com.sun.jersey.api.core.PackagesResourceConfig {
    public ApplicationConfig(){
        super("com.suhael.rest;com.fasterxml.jackson.jaxrs.json");
    }
}
