package resources;

import services.FilmsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("films")
@Produces(MediaType.APPLICATION_JSON)
public class FilmsResource {

    @Inject
    private FilmsService filmsService;

    @GET
    public Response getFilms() {
        return Response.ok(filmsService.getFilms()).build();
    }
}
