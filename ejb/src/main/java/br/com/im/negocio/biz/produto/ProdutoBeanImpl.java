package br.com.im.negocio.biz.produto;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.dao.produtos.ProdutosDao;
import br.com.im.negocio.models.Produto;

@Stateless
public class ProdutoBeanImpl implements ProdutoBean{
	
	@EJB
	private ProdutosDao dao;
	
	public List<Produto> listar() {
		return dao.listar();
	}

}
