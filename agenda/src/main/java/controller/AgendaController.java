package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

/**
 * Servlet implementation class AgendaController
 */
@WebServlet(urlPatterns = { "/AgendaController", "/main" })
public class AgendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DAO dao = new DAO();

	public AgendaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();

		System.out.println(action);

		boolean CAMINHO_DE_MAIN_CORRETO = action.equals("/main");

		if (CAMINHO_DE_MAIN_CORRETO) {
			getContatos(request, response);
		}

		dao.testeConexao();
	}

	// listar contatos
	protected void getContatos(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("agenda.jsp");
	}
}
