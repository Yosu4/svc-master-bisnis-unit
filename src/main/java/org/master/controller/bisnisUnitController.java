package org.master.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/bisnis-unit")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class bisnisUnitController {

    @Path("/getData")
    @GET
    public Response getAllData(){
        Map map = new HashMap();
        map.put("status", "Sukses");
        return Response.ok(map).build();
    }
}
