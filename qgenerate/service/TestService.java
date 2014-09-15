package qgenerate.service;



import java.util.Properties;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("test")
public class TestService {
	@GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
		Gson gson = new Gson();
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey and JSON : </body></h1>" + "</html> ";
	  }
	
}
