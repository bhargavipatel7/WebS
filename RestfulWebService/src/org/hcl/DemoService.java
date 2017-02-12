package org.hcl;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/demo")
public class DemoService {
	public String Else(){
		return "Hi Again!";
	}
	@GET
	@Path("/hello")
	public String Hey(){
		return "Hey there!";
	}
}

