<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.proxibank.domaine.Client"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>La liste Client</title>
</head>
<body>
	
	<table>

		<tr style="border: 1px Solid Black;">
			<th style="border: 1px Solid Black;">Identifiant</th>
			<th style="border: 1px Solid Black;">Nom</th>
			<th style="border: 1px Solid Black;">Prenom</th>
			<th style="border: 1px Solid Black;">Mail</th>
			<th style="border: 1px Solid Black;">Adresse</th>
		</tr>
		<tr style="border: 1px Solid Black;">
			<%
				ArrayList<Client> listeClient = (ArrayList<Client>) session.getAttribute("listeClient");
			%>
			<%
				for (Client client : listeClient) {
			%>

			<td style="border: 1px Solid Black;"><a href=eleveEnseignant.jsp?><%=client.getIdClient()%></a></td>
			<td style="border: 1px Solid Black;"><%=client.getNom()%></td>
			<td style="border: 1px Solid Black;"><%=client.getPrenom()%></td>
			<td style="border: 1px Solid Black;"><%=client.getMail()%></td>
			<td style="border: 1px Solid Black;"><%=client.getAdresse()%></td>
		</tr>

		<%
			}
		%>

	</table>
</body>
</html>