package net.codejava.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/bonjour")
public class HelloResource {
	
	
//http://localhost:8080/HelloRestWithJersey/rest/bonjour
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String direBonjour() {
		return "Bonjour Man, tout le monde!";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<html><title>Hello RESTT</title><body>"
				+ "<h1>Bonjour, tout le monde!</h1></body></html>";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public Student sayJsonHello() { // nesne olmasý lazým
			return new Student(1298,"Mustafa Ozcelik","Turkey");
					
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	@Path("/xml")
	public Student sayXmlHello() { // nesne olmasý lazým
			return new Student(1298,"Mustafa Ozcelik","Turkey");
					
	}
	
}

