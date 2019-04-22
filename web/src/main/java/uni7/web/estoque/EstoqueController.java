package uni7.web.estoque;

import java.io.Serializable;

import javax.ejb.EJB;

import uni7.ejb.biz.estoque.EstoqueBean;
import uni7.ejb.models.Estoque;

public class EstoqueController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 941147101584674276L;
	
	@EJB
	private EstoqueBean bean;

	public Estoque listar(){
		return bean.listar();
	}

}
