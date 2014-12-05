package sum.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sum.core.Output;

import com.codahale.metrics.annotation.Timed;

@Path("/sum")
@Produces(MediaType.APPLICATION_JSON)
public class SumResource {

	@GET
	@Path("/{a}/{b}")
	@Timed
	public Output add(@PathParam("a") int a, @PathParam("b") int b) {
		return new Output(String.valueOf(a + b));
	}
}