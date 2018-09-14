  
<!doctype html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Hanson Nell Nabil">

    <title>Application Proxibanque</title>

    <!-- Bootstrap core CSS -->
    <!--<link href="../../dist/css/bootstrap.min.css" rel="stylesheet">-->
    <link href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/cosmo/bootstrap.min.css" rel="stylesheet" integrity="sha384-3Ivskwia8Fui5tbQi+RW4DgTkJ8d+hW7mLe7Yk89ibmD9482VECh0WFof8kIEjwI" crossorigin="anonymous">

    <!-- Custom styles for this template -->
    <link href="inc/css/banqueStyle.css" rel="stylesheet">
  </head>

  <body class="text-center">

    <form class="form-signin" method="POST" action="MaServlet">
      <img class="mb-4" src="../../assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">

      <h1 class="h4 mb-3 font-weight-bold"> Bienvenue sur l'application Proxibanque </h1>
      <h3 class="h5 mb-3 font-weight-normal">Connectez-vous</h3>

      <label for="inputEmail" class="sr-only">Login</label>
      <input type="text" id="login" name="login" class="form-control" placeholder="login" value="Toufix" required autofocus>

      <label for="inputPassword" class="sr-only">Mot de passe</label>
      <input type="password" id="password" name="password" class="form-control" placeholder="mot de passe" value="Coffee" required>

   

      <button class="btn btn-lg btn-primary btn-block" type="submit">Connexion</button>
      <p class="mt-5 mb-3 text-muted">&copy;2018 Proxibanque</p>
    </form>
	

  </body>
</html>
