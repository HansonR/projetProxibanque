package fr.gtm.proxibank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.proxibank.domaine.Client;

public class ClientDao {
	Statement st;
	ResultSet rs;
	Connection cn;

	// Méthode pour récupérer Tous les Clients
	public ArrayList<Client> getAllClient(int idConseiller) {
		// Information d'accès à la base de données

		GestionConnexionBd Db = new GestionConnexionBd();
		Db.connexionBd();
		cn = Db.getConnexion();
		ArrayList<Client> listeClient = new ArrayList<Client>();

		try {
			// Création d'un statement
			st = cn.createStatement();

			String sql = "SELECT * FROM `client` where id_conseiller= '" + idConseiller + "'";
			// exécution requête
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)
			while (rs.next()) {
				Client client = new Client();

				client.setIdClient(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));

				listeClient.add(client);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Db.deconnexionBd();

		return listeClient;
	}

	public Client getClientById(int id) {

		// Information d'accès à la base de données
		GestionConnexionBd Db = new GestionConnexionBd();
		Db.connexionBd();
		cn = Db.getConnexion();

		Client client = new Client();

		try {
			// Création d'un statement
			st = cn.createStatement();
			String sql = "SELECT * FROM client WHERE  id_client = " + id;
			rs = st.executeQuery(sql);

			// Si récup données alors étapes 5 (parcours Resultset)

			while (rs.next()) {
				client.setIdClient(rs.getInt("id_client"));
				client.setNom(rs.getString("nom"));
				client.setPrenom(rs.getString("prenom"));
				client.setMail(rs.getString("mail"));
				client.setAdresse(rs.getString("adresse"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Db.deconnexionBd();

		// System.out.println("bidim"+client);
		return client;
	}

	public Client UpdatClient(Client client) {
		

		// Information d'accès à la base de données
		GestionConnexionBd Db = new GestionConnexionBd();
		Db.connexionBd();
		cn = Db.getConnexion();

		try {
			// creation statement
			st = cn.createStatement();

			String sql = "UPDATE client SET nom = '" + client.getNom() + "', prenom = '" + client.getPrenom()
					+ "', mail = '" + client.getMail() + "', adresse = '" + client.getAdresse() + "' WHERE client.id_client = " + client.getIdClient();

			// execution de la requete
			st.executeUpdate(sql);

			System.out.println(
					client.getNom() + " " + client.getPrenom() + " " + client.getMail() + " " + client.getAdresse());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		Db.deconnexionBd();
		return client;
	}

}
