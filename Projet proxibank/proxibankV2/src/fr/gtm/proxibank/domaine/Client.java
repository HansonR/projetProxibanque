package fr.gtm.proxibank.domaine;

public class Client {

	private int idClient;
	private String nom;
	private String prenom;
	private String mail;
	private String adresse;
	private Compte compte;

	// constructeur

	public Client(int idClient, String nom, String prenom, String mail, String adresse) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.adresse = adresse;
	}

	public Client(int idClient) {
		super();
		this.idClient = idClient;
	}

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

	/// getteur setteurs

	public int getIdClient() {
		return idClient;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse="
				+ adresse + ", compte=" + compte + "]";
	}

}
