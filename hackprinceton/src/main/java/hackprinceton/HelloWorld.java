package hackprinceton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

@Component
@Path("/helloworld")
public class HelloWorld {
	
	@GET
	@Path("/sayhello")
	public Response sayHello() {
		String result = "hello";
		return Response.status(200).entity(result).build();
	}
}
