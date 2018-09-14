package fr.gtm.proxibankwebservice.service;


//import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.MediaType;
//import com.mkyong.webservice;
//import javax.ws.rs.core.Response;



@Path("/webservice")
public class ProxiRestGet {
	
	@GET
	@Path("/getenText")
	@Produces(MediaType.TEXT_HTML)
	public String getListeClientInText() {

		
		ClientService listeClientService = new ClientService();
		return listeClientService.recupererListeClient().toString();
		
		
	} 

	/*
	@GET
	@Path("/get")
	@Produces("application/text")
	public Response getListeClientInJSON() {
		
		System.out.println("***************** DANS LA LAmEThode");

		
		ClientService listeClientService = new ClientService();
		List<Client> clients = listeClientService.recupererListeClient();
		
		System.out.println(clients);
		
		GenericEntity <List<Client> > entity;
		  entity  = new GenericEntity< List<Client > >( clients ) { };
		return Response.ok(entity).build();
		
		*/

}