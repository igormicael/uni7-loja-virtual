package br.com.im.negocio.dao.estoque;

import javax.ejb.Local;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

@Local
public interface EstoqueDao {

	Estoque listar();

	void inserirItem(ItemEstoque item);

}
