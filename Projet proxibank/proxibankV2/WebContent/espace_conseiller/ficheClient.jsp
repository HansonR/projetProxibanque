<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.proxibank.domaine.Client"%>
<%@ page import="java.util.ArrayList"%>

<!doctype html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Proxibanque</title>

    <!-- Bootstrap core CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-3Ivskwia8Fui5tbQi+RW4DgTkJ8d+hW7mLe7Yk89ibmD9482VECh0WFof8kIEjwI" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="inc/css/appli.css" rel="stylesheet">
  </head>

  <body>

    <header>
      <!-- Fixed navbar -->
      <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
        <a class="navbar-brand" href="listeClient.jsp">Proxibanque</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="listeClient.jsp">Home <span class="sr-only"></span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Support</a>
            </li>

          </ul>
        </div>
      </nav>
    </header>

    <!-- Begin page content -->
    <main role="main" class="container">

      <div class="card text-center">
  <div class="card-header">
    <!-- dans cette div je souhaite afficher l'ID du client -->
			<%
				Client client = (Client) session.getAttribute("Client");
				//ArrayList<Client> listeClient = (ArrayList<Client>) session.getAttribute("Client");
			 %>

    <ul class="nav nav-pills card-header-pills">
      <li class="nav-item">
        <a class="nav-link disabled" href="#">identifiant du client : <%=client.getIdClient()%> </a>
      </li>
    </ul>
  </div>
	<form class="" action="ServletEditer" method="post">
  <div class="card-body">
    <h5 class="card-title">Nom du client</h5>
    <div class="alert alert-primary" role="alert">
      <!-- ici on mets le nom a modifier -->
      <!-- --------------------------------------------------------------- -->
      <%=client.getNom()%>
    <input class="form-control" type="text" placeholder="nouveau nom" name="nomNew" >
    </div>

    <h5 class="card-title">Prenom du client</h5>
    <div class="alert alert-primary" role="alert">
      <!-- ici on mets le prenom a modifier -->
      <!-- --------------------------------------------------------------- -->
      <%=client.getPrenom()%>
    <input class="form-control" type="text" placeholder="nouveau Prenom" name="prenomNew" >
    </div>

    <h5 class="card-title">Email</h5>
    <div class="alert alert-primary" role="alert">
      <!-- ici on mets le nom a modifier -->
      <!-- --------------------------------------------------------------- -->
      <%=client.getMail()%>
    <input class="form-control" type="text" placeholder="nouveau Mail" name="mailNew" >
    </div>

    <h5 class="card-title">Adresse</h5>
    <div class="alert alert-primary" role="alert">
      <!-- ici on mets le nom a modifier -->
      <!-- --------------------------------------------------------------- -->
      <%=client.getAdresse()%>
    <input class="form-control" type="text" placeholder="nouvelle Adresse" name="nomAdresse" >
    </div>

    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Modifier
    <input class="btn btn-outline-warning my-2 my-sm-0" type="hidden" name="sdClient" value="<%=client.getIdClient()%>"/>
    </button>
  </div>
</div>

</form>

    </main>

    <footer class="footer">
      <div class="container">
        <span class="text-muted">&copy;2018 Proxibanque</span>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery-slim.min.js"><\/script>')</script>
    <script src="../../assets/js/vendor/popper.min.js"></script>
    <script src="../../dist/js/bootstrap.min.js"></script>
  </body>
</html>
