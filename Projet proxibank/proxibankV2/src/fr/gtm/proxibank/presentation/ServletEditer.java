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
 * Servlet implementation class ServletEditer
 */
@WebServlet("/ServletEditer")
public class ServletEditer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEditer() {
		super();

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

		// recuperation des champs a modifier.... tous quoi :)

		String nNom = request.getParameter("nomNew");
		String nPrenom = request.getParameter("prenomNew");
		String nMail = request.getParameter("mailNew");
		String nAdresse = request.getParameter("nomAdresse");
		String sClient = request.getParameter("sdClient");
		int idClient = Integer.parseInt(sClient);

		Client nClient = new Client(idClient,nNom, nPrenom, nMail, nAdresse);

		// Envoie des parametres recuperer a la methode service
		ClientService clientService = new ClientService();
		nClient = clientService.editionDeClient(nClient);

		HttpSession maSession = request.getSession();
		maSession.setAttribute("Client", nClient);

		RequestDispatcher dispatcher;
		

		dispatcher = request.getRequestDispatcher("espace_conseiller/ficheClient.jsp");
		dispatcher.forward(request, response);

	}

}
