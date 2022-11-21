package br.com.salomao.resources;

import java.util.Objects;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.salomao.services.AlticciService;

@Path("/")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class AlticciResource {

    @Inject
    private AlticciService alticciService;

    @GET
    @Path("alticci/{n}")
    public Response find(@PathParam("n") Long id) {
        Long response = alticciService.find(id);
        if(Objects.isNull(response)) {
            return Response.noContent().build();
        }
        return Response.ok().entity(response).build();
    }

}
