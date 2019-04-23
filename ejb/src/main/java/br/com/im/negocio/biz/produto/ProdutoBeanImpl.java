package br.com.im.negocio.biz.produto;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.im.negocio.dao.produtos.ProdutosDao;
import br.com.im.negocio.models.Produto;

@Stateless
@LocalBean
public class ProdutoBeanImpl implements ProdutoBean {
	
	@Inject
	private ProdutosDao dao;
	
	@Override
	public List<Produto> listar() {
		return dao.listar();
	}

}
