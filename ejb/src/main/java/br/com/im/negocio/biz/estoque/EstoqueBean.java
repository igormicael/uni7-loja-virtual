package br.com.im.negocio.biz.estoque;

import javax.ejb.Local;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

@Local
public interface EstoqueBean {
	
	Estoque listar();
	
	void inserirItem(ItemEstoque item);

}
