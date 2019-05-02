package br.com.im.web.estoque;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

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
			if(acao.equalsIgnoreCase("adicionar")) {
				controller.adicionarItem(item);
			}
			if(acao.equalsIgnoreCase("diminuir")) {
				controller.diminuirItem(item);
			}
		}
		
		consultar(response, out);
		
	}

	private void consultar(HttpServletResponse response, PrintWriter out) {
		Estoque estoque = controller.listar();
		out.print(formatToJSON(estoque, response));
	}
	
	private String formatToJSON(Estoque estoque, HttpServletResponse response) {
		List<ItemEstoque> itens = estoque.getItens();
		
		String estoqueStr = new Gson().toJson(itens);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        return estoqueStr;
	}

}
