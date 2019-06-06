package br.com.trevezani.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/versao")
@Singleton
public class VersaoController {

    @GET
    public String versao() {
        return "v1.00";
    }

}
