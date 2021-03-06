package fr.gtm.proxibank.domaine;

public class Conseiller {

	private int idConseiller;
	private String nom;
	private String prenom;
	private String login;
	private String password;

	public Conseiller(int idConseiller, String nom, String prenom, String login, String password) {
		super();
		this.idConseiller = idConseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	public Conseiller() {
		super();
	}

	public Conseiller(int idConseiller, String login, String password) {
		super();
		this.idConseiller = idConseiller;
		this.login = login;
		this.password = password;
	}

	public Conseiller(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
				+ ", password=" + password + "]";
	}

}
