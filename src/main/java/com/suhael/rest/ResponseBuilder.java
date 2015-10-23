package com.suhael.rest;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.ok;

/**
 * Created by root on 23/10/15.
 */
public class ResponseBuilder {

    public static Response returnJsonResponse(Object entity) {
        return response(entity, MediaType.APPLICATION_JSON);
    }
    protected static Response returnHTMLResponse(Object entity) {
        return response(entity, MediaType.TEXT_HTML);
    }

    private static Response response(Object entity, String mediaType) {
        return ok(entity)
                .header("Content-Type", mediaType)
                .build();
    }

}
