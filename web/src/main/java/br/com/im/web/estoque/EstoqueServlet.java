package br.com.im.web.estoque;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.im.negocio.models.Estoque;
import br.com.im.web.utils.Utils;

@WebServlet("/estoque")
public class EstoqueServlet extends HttpServlet{
	
	private static final long serialVersionUID = -440030668501537079L;

	@Inject
	private EstoqueController controller;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String acao = request.getParameter("acao");
		
		if(acao == null) {
			acao = "consultar";
		}
			
		String item = request.getParameter("item");
		
		if(item != null) {
			if(acao.equalsIgnoreCase("aumentar")) {
				controller.aumentarQuantidade(item);
			}
			if(acao.equalsIgnoreCase("diminuir")) {
				controller.diminuirQuantidade(item);
			}
		}
		
		consultar(response, out);
		
	}

	private void consultar(HttpServletResponse response, PrintWriter out) {
		Estoque estoque = controller.listar();
		out.print(Utils.formatToJSON(estoque.getItens(), response));
	}

}
