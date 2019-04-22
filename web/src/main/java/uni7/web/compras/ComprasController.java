package uni7.web.compras;

import java.io.Serializable;

import javax.ejb.EJB;

import uni7.ejb.biz.carrinho.CarrinhoBean;

public class ComprasController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5553943117030531059L;
	
	@EJB
	private CarrinhoBean bean;
	
	public String acao(String txt) {
		return bean.acao(txt);
	}

}
