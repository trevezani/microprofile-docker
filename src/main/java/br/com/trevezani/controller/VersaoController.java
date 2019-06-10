package br.com.trevezani.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/versao")
public class VersaoController {

    @GET
    @Produces("text/plain")
    public Response versao() {
        return Response.ok("v1.00").build();
    }

}
