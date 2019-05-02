package br.com.im.negocio.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.models.Produto;

@Startup
@Singleton
public class InfoBean {

	private Estoque estoque;
	private List<Produto> produtos;

	@PostConstruct
	public void inicializar() {
		inicializarProdutos();
		inicializarEstoque();
	}

	private void inicializarProdutos() {
		produtos = new ArrayList<>();
		
		produtos.add(new Produto(1L, "Arroz", BigDecimal.ONE));
		produtos.add(new Produto(2L, "Feijao", BigDecimal.ONE));
		produtos.add(new Produto(3L, "Macarrao", BigDecimal.ONE));
		produtos.add(new Produto(4L, "Batata", BigDecimal.ONE));
		
	}

	private void inicializarEstoque() {
		estoque = new Estoque();

		List<ItemEstoque> itens = new ArrayList<>();

		if(produtos != null) {
			for (int i = 0; i < produtos.size(); i++) {
				int j = i+ 1;
				Produto produto = produtos.get(i);
				itens.add(new ItemEstoque(Long.valueOf(j), produto, Long.valueOf(j * 5L)));
			}
		}

		estoque.setItens(itens);
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
