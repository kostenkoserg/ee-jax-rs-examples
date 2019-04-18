package org.kostenko.example.jaxrs;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author kostenko
 */
@Path("/clusterdemo")
@Stateless
public class ClusterDemoEndpoint {

    @GET
    @Path("/serverinfo")
    public Response getServerInfo() {
        
        return Response.ok().entity("Server: " + System.getProperty("server.name")).build();
    }
}
