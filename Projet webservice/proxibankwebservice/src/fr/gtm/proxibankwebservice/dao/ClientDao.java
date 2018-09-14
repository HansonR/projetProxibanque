package fr.gtm.proxibankwebservice.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import fr.gtm.proxibankwebservice.domaine.Client;

public class ClientDao {

	Statement st;
	ResultSet rs;
	Connection cn;

	// M�thode pour r�cup�rer Tous les Clients
	public ArrayList<Client> getAllClient() {
		// Information d'acc�s � la base de donn�es

		GestionConnexionBd Db = new GestionConnexionBd();
		Db.connexionBd();
		cn = Db.getConnexion();
		ArrayList<Client> listeClient = new ArrayList<Client>();

		try {
			// Cr�ation d'un statement
			st = cn.createStatement();

			String sql = "SELECT nom,prenom,mail,adresse  FROM `client`";
			// ex�cution requ�te
			rs = st.executeQuery(sql);

			// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
			while (rs.next()) {
				Client client = new Client();

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

}
