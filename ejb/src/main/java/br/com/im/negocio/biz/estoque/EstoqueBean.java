package br.com.im.negocio.biz.estoque;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

public interface EstoqueBean {
	
	Estoque listar();
	
	void inserirItem(ItemEstoque item);

}
