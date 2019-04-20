package uni7.web.produtos;

import java.io.Serializable;

import javax.ejb.EJB;

import uni7.ejb.estoque.EstoqueBean;

public class ProdutosController  implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2119056742065360058L;
	
	@EJB
	private EstoqueBean bean;

	public String acao(String txt) {
		return bean.acao(txt);
	}

}
