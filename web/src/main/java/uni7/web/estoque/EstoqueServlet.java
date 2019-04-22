package uni7.web.estoque;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/estoque")
public class EstoqueServlet extends HttpServlet{
	
	private static final long serialVersionUID = -440030668501537079L;

	@Inject
	private EstoqueController controller;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		if(acao.equalsIgnoreCase("consultar")) {
			controller.listar();
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO: criar logica para o cadastrar
	}

}
