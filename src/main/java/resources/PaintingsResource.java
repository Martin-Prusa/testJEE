package resources;

import services.PaintingsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("paintings")
@Produces(MediaType.APPLICATION_JSON)
public class PaintingsResource {

    @Inject
    private PaintingsService paintingsService;

    @GET
    public Response getPaintings() {
        return Response.ok(paintingsService.getPaintings()).build();
    }

    @GET
    @Path("authors")
    public Response getAuthors() {
        return Response.ok(paintingsService.getAuthors()).build();
    }
}
