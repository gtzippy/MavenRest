/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.gatech.sad.project4;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author smithda
 */
@Path("getProfessor")
public class GetProfessorResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GetProfessorResource
     */
    public GetProfessorResource() {
    }

    /**
     * Retrieves representation of an instance of edu.gatech.sad.project4.GetProfessorResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "professor";
    }

    /**
     * PUT method for updating or creating an instance of GetProfessorResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
