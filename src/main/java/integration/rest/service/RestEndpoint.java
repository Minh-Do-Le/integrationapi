package integration.rest.service;

import integration.dto.CustomerDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by domin on 16-Jan-20.
 */
@Path("rs")
public class RestEndpoint {
    @Path("create")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String createContract(@QueryParam("forName") String forName, @QueryParam("lastName") String lastName, @QueryParam("birthday") String birthday, @QueryParam("address") String address, @QueryParam("postNumber") String postNumber, @QueryParam("postArea") String postArea, @QueryParam("phoneNumber") String phoneNumber, @QueryParam("email") String email){
        //CustomerDto customerDto = new CustomerDto(0L, forName, lastName, birthday, address, postNumber,postArea, phoneNumber, email);
        return "";
    }
}
