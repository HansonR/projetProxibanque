package fr.gtm.proxibank.service;


import fr.gtm.proxibank.dao.ConseillerDao;
import fr.gtm.proxibank.domaine.Conseiller;

public class ConseillerService {
	
	// 1.D�claration du Dao
		ConseillerDao dao = new ConseillerDao();

		// 2.Utiliser Dao dans m�thodes
		public int authentifierConseiller(Conseiller conseiller) {
			
			int a = dao.getConseiller(conseiller);
			return a;

		}

}
