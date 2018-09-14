package fr.gtm.proxibank.service;


import fr.gtm.proxibank.dao.ConseillerDao;
import fr.gtm.proxibank.domaine.Conseiller;

public class ConseillerService {
	
	// 1.Déclaration du Dao
		ConseillerDao dao = new ConseillerDao();

		// 2.Utiliser Dao dans méthodes
		public int authentifierConseiller(Conseiller conseiller) {
			
			int a = dao.getConseiller(conseiller);
			return a;

		}

}
