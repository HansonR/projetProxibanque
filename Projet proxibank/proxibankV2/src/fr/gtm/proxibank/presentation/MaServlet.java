package fr.gtm.proxibank.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.proxibank.domaine.Conseiller;
import fr.gtm.proxibank.dao.ConseillerDao;
import fr.gtm.proxibank.domaine.Client;
import fr.gtm.proxibank.service.ClientService;
import fr.gtm.proxibank.service.ConseillerService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/MaServlet")
public class MaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		traitement(request, response);
	}

	protected void traitement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// recuperer login et password du formulaire
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		Conseiller conseiller = new Conseiller(login, password);
		ConseillerDao conseillerdao = new ConseillerDao();

		// authentification depuis la servlet
		ConseillerService conseillerService = new ConseillerService();
		int a = conseillerService.authentifierConseiller(conseiller);

		// on entre dans le traitement suivant pour recuperer la liste d'un client
		if (a != 0) {
			// Client client = new Client();

			ArrayList<Client> listeClient = new ArrayList<Client>();

			ClientService clientService = new ClientService();

			// on recupere la liste des clients grace a l'ID du conseiller

			listeClient = clientService.recupererListeClient(conseillerdao.getConseiller(conseiller));

			HttpSession maSession = request.getSession();
			maSession.setAttribute("listeClient", listeClient);

			RequestDispatcher dispatcher;

			// dispatcher = request.getRequestDispatcher("Accueil.html");
			// dispatcher = request.getRequestDispatcher("index.html");

			dispatcher = request.getRequestDispatcher("espace_conseiller/listeClient.jsp");
			dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher;
			dispatcher = request.getRequestDispatcher("ErrorPage.jsp");

			dispatcher.forward(request, response);
		}
	}

}
