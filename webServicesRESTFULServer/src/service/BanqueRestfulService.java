package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.Compte;

@Path("/banque")
public class BanqueRestfulService {

	// Simule une base de données.
	private static Map<Integer, Compte> comptes = new HashMap<Integer, Compte>();

	@GET
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)   //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement in entity)
	@Consumes(MediaType.APPLICATION_JSON) //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement in entity)
	public double conversion (@PathParam("montant") double montant) {
		return montant * 11 ; 
	}
	
	@GET
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON) //add MediaType.APPLICATION_XML if you want XML as well (don't forget @XmlRootElement in entity)
	public Compte getCompte ( @PathParam("code") int code) {
		//return new Compte(code, Math.random()*67000, new Date());
		return comptes.get(code) ; 
	}
	
	@GET
	@Path("/comptes")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Compte> listComptes() {
		return new ArrayList<Compte>(comptes.values()) ; 
	}
	
	@POST
	@Path("/comptes")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Compte save (Compte compte ) {
		/*
		 compte in body =>
		   {
            "code": 1,
             "solde": 10000
          } 
	   */
		compte.setDateCreation(new Date());
		comptes.put(compte.getCode(), compte);
		return compte;
	}

	@PUT
	@Path("/comptes/{code}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Compte miseAjours (Compte compte,@PathParam("code")int code ) {
		/*
		 compte in body =>
		   {
             "code": 1,
              "solde": 10000
           } 
	*/
		comptes.put(code, compte);
		return compte;
	}
	
	@DELETE
	@Path("/comptes/{code}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public boolean delete (@PathParam("code")int code ) {
		comptes.remove(code);
		return true;
	}
	
}
