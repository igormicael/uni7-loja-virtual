package br.com.im.negocio.biz.estoque;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.dao.estoque.EstoqueDao;
import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

@Stateless
public class EstoqueBeanImpl implements EstoqueBean{
	
	@EJB
	private EstoqueDao dao;
	
	public Estoque listar() {
		return dao.listar();
	}

	public void inserirItem(ItemEstoque item) {
		dao.inserirItem(item);
	}

}
