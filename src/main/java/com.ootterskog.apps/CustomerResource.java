package com.ootterskog.apps;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api
@Component
@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    @Inject
    CustomerRepository customerRepository;

    @GET
    @Path("/")
    public Iterable<Customer> getCustomers() {
        return customerRepository.findAll();
    }

}
