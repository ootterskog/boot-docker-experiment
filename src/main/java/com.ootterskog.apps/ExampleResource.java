package com.ootterskog.apps;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Api
@Component
@Path("/example")
public class ExampleResource {

    @GET
    @Path("/world")
    public String world() {
        return "Hello Docker World";
    }
}
