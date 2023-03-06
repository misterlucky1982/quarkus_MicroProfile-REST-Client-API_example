package nby.misterlucky.quarkus.restclient.web;

import nby.misterlucky.quarkus.restclient.domain.entity.Customer;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;
@RegisterRestClient
@Path("customers")
@Produces("application/json")
@Consumes("application/json")
public interface CustomerEndpointItf {
    @GET
    List<Customer> getAll();

    @POST
    Response create(Customer customer);

    @PUT
    Response update(Customer customer);

    @DELETE
    Response delete(Long customerId);
}
