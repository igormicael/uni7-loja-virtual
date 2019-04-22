package uni7.ejb.biz.produto;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import uni7.ejb.dao.produtos.ProdutosDao;
import uni7.ejb.models.Produto;

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
