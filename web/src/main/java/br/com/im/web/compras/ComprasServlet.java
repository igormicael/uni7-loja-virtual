package br.com.im.web.compras;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.im.negocio.models.ItemEstoque;
import br.com.im.web.utils.Utils;

@WebServlet("/carrinho")
public class ComprasServlet extends HttpServlet {

	@Inject
	private ComprasController controller;

	/**
	 * 
	 */
	private static final long serialVersionUID = -725158160013560878L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String acao = request.getParameter("acao");
		String produto = request.getParameter("produto");
		String quantidade = request.getParameter("quantidade");

		if(acao == null) {
			acao = "consultar";
		}

		if(acao.equalsIgnoreCase("adicionar")) {
			controller.adicionarItem(produto,quantidade);
		}
		
		if(acao.equalsIgnoreCase("remover")) {
			controller.removerItem(produto,quantidade);
		}
		
		consultar(response, out);
		
	}
	
	private void consultar(HttpServletResponse response, PrintWriter out) {
		List<ItemEstoque> itens = controller.getItens();
		out.print(Utils.formatToJSON(itens, response));
	}

}
