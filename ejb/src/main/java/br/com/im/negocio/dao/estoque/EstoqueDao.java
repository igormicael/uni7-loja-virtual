package br.com.im.negocio.dao.estoque;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

public interface EstoqueDao {

	Estoque listar();

	void inserirItem(ItemEstoque item);

}
