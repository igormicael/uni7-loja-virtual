package br.com.im.negocio.biz.produto;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.models.Produto;
import br.com.im.negocio.utils.InfoBean;

@Stateless
public class ProdutoBeanImpl implements ProdutoBean{
	
	@EJB
	private InfoBean infoBean;
	
	public List<Produto> listar() {
		return infoBean.getProdutos();
	}

}
