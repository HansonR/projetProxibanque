package fr.gtm.proxibank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.gtm.proxibank.domaine.Conseiller;

public class ConseillerDao {

	Statement st;
	ResultSet rs;
	Connection cn;

	public int getConseiller(Conseiller conseiller) {

		// Information d'accès à la base de données
		GestionConnexionBd Db = new GestionConnexionBd();
		Db.connexionBd();
		cn = Db.getConnexion();

		int a = 100;
		int b = 0;

		try {
			st = cn.createStatement();

			/*
			 * String sql = "SELECT id_conseiller FROM conseiller where  login = '" +
			 * conseiller.getLogin() + "' and password = '" + conseiller.getPassword()+"'";
			 */

			String sql = "SELECT * FROM conseiller where  login = '" + conseiller.getLogin() + "' and password = '"
					+ conseiller.getPassword() + "'";

			rs = st.executeQuery(sql);

			while (rs.next()) {
				Conseiller conseiller0 = new Conseiller();

				conseiller0.setIdConseiller(rs.getInt("id_conseiller"));
				b = conseiller0.getIdConseiller();

				if (rs.wasNull())

					b = 0;
				// 113 est notre code erreur

				System.out.println(a);
				System.out.println(conseiller0);
				System.out.println(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Db.deconnexionBd();

		return b;

	}

}
