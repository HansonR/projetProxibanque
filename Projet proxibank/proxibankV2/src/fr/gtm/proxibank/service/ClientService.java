package fr.gtm.proxibank.service;

import java.util.ArrayList;
import fr.gtm.proxibank.dao.ClientDao;
import fr.gtm.proxibank.domaine.Client;


public class ClientService {

	// 1.Déclaration du Dao
	ClientDao dao = new ClientDao();

	public ArrayList<Client> recupererListeClient(int idConseiller) {
		return dao.getAllClient(idConseiller);

	}

	public Client recupereInfoClient(int IdClient) {

		return dao.getClientById(IdClient);
		 
	}
	
	public Client editionDeClient(Client client) {
		
		return dao.UpdatClient(client);
	}

}
