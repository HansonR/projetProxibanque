package fr.gtm.proxibankwebservice.domaine;

public class Client {
	
	
	// Attributs
		
		private String nom;
		private String prenom;
		private String mail;
		private String adresse;
		
		
		public Client(String nom, String prenom, String mail, String adresse) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.mail = mail;
			this.adresse = adresse;
		}


		public Client() {
			super();
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getMail() {
			return mail;
		}


		public void setMail(String mail) {
			this.mail = mail;
		}


		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}


		@Override
		public String toString() {
			return "Client [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse + "]";
		}
		
		
		

}
