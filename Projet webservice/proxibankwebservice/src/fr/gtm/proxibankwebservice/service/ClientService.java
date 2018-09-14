package fr.gtm.proxibankwebservice.service;

import java.util.ArrayList;

import fr.gtm.proxibankwebservice.dao.ClientDao;
import fr.gtm.proxibankwebservice.domaine.Client;


public class ClientService {
	
	
	
	// 1.Déclaration du Dao
		ClientDao dao = new ClientDao();
		
		
		
	public ArrayList<Client> recupererListeClient() {
		return dao.getAllClient();

	}
	
	

}
