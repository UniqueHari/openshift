package dwsample.resources;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang.StringUtils;

import dwsample.pojo.Saying;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
	private final String template;
	private final AtomicLong counter;

	public HelloWorldResource(String template) {
		super();
		this.template = template;
		this.counter = new AtomicLong();
	}

	@GET
	public Saying sayHello(@QueryParam("name") String name) {
		String greeting = "";
		if(StringUtils.isNotBlank(name)) {
			greeting = String.format(template, name);
		} else {
			 greeting = String.format(template, "default");
		}
		return new Saying(counter.incrementAndGet(), greeting);
	}
}
