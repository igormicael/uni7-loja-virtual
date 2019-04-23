package br.com.im.negocio.dao.estoque;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.models.Produto;

public class EstoqueDaoImpl implements EstoqueDao {
	
	private Estoque estoque = null;
	
	@PostConstruct
	public void inicializar() {
		estoque = new Estoque();
		
		List<ItemEstoque> itens = new ArrayList<>();
		
		itens.add(new ItemEstoque(1L, new Produto(1L, "Arroz", BigDecimal.ONE), 10L));
		
		estoque.setItens(itens);
		
	}

	@Override
	public Estoque listar() {
		return estoque;
	}

	@Override
	public void inserirItem(ItemEstoque item) {
		if(estoque != null && estoque.getItens() != null) {
			estoque.getItens().add(item);
		}
	}

}