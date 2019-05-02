package br.com.im.negocio.dao.produtos;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.models.Produto;
import br.com.im.negocio.utils.InfoBean;

@Stateless
public class ProdutosDaoImpl implements ProdutosDao{

	@EJB
	private InfoBean infoBean;
	
	public List<Produto> listar() {
		return infoBean.getProdutos();
	}

}
