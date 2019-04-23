package br.com.im.web.produtos;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import br.com.im.negocio.biz.produto.ProdutoBean;
import br.com.im.negocio.models.Produto;

public class ProdutosController  implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2119056742065360058L;
	
	@EJB
	private ProdutoBean bean;

	public List<Produto> listar(){
		return bean.listar();
	}

}
