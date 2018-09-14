package fr.gtm.proxibank.domaine;

public class Compte {

	private float soldeCourant;
	private float soldeEpargne;
	private int idClient;

	public Compte(float soldeCourant, float soldeEpargne, int idClient) {
		super();
		this.soldeCourant = soldeCourant;
		this.soldeEpargne = soldeEpargne;
		this.idClient = idClient;
	}

	public Compte() {
		super();
	}

	public float getSoldeCourant() {
		return soldeCourant;
	}

	public void setSoldeCourant(float soldeCourant) {
		this.soldeCourant = soldeCourant;
	}

	public float getSoldeEpargne() {
		return soldeEpargne;
	}

	public void setSoldeEpargne(float soldeEpargne) {
		this.soldeEpargne = soldeEpargne;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	@Override
	public String toString() {
		return "Compte [soldeCourant=" + soldeCourant + ", soldeEpargne=" + soldeEpargne + ", idClient=" + idClient
				+ "]";
	}

}
