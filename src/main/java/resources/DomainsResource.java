package resources;

import services.DomainsService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("domains")
@Produces(MediaType.APPLICATION_JSON)
public class DomainsResource {

    @Inject
    private DomainsService domainsService;

    @GET
    public Response getDomains() {
        return Response.ok(domainsService.getPrices()).build();
    }
}
