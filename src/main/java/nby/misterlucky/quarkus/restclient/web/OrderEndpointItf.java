package nby.misterlucky.quarkus.restclient.web;

import nby.misterlucky.quarkus.restclient.domain.entity.Orders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
@RegisterRestClient
@Path("orders")
@Produces("application/json")
@Consumes("application/json")
public interface OrderEndpointItf {
    @GET
    List<Orders> getAll(@QueryParam("customerId") Long customerId);

    @POST
    @Path("/{customer}")
    Response create(Orders order, @PathParam("customer") Long customerId);

    @PUT
    Response update(Orders order);

    @DELETE
    @Path("/{order}")
    Response delete(@PathParam("order") Long orderId);
}
