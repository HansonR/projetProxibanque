package fr.gtm.proxibank.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.gtm.proxibank.domaine.Client;
import fr.gtm.proxibank.service.ClientService;

/**
 * Servlet implementation class FicheClient
 */
@WebServlet("/FicheClient")
public class FicheClient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FicheClient() {
		super();
		// TODO Auto-generated constructor stub
	}

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

		// recuperer Indentifiant Client

		String sClient = request.getParameter("sdClient");
		int idClient = Integer.parseInt(sClient);

		if (idClient != 0) {
			Client client1 = new Client();

			// authentification depuis la servlet
			ClientService ClientService = new ClientService();
			client1 = ClientService.recupereInfoClient(idClient);

			HttpSession maSession = request.getSession();
			maSession.setAttribute("Client", client1);

			RequestDispatcher dispatcher;

			dispatcher = request.getRequestDispatcher("espace_conseiller/ficheClient.jsp");
			dispatcher.forward(request, response);

		} else {

			RequestDispatcher dispatcher;
			dispatcher = request.getRequestDispatcher("ErrorPage.jsp");

			dispatcher.forward(request, response);

		}

	}
}
