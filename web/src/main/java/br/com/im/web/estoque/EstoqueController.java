package br.com.im.web.estoque;

import java.io.Serializable;

import javax.ejb.EJB;

import br.com.im.negocio.biz.estoque.EstoqueBean;
import br.com.im.negocio.models.Estoque;

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
	
	public void aumentarQuantidade(String item) {
		bean.aumentarQuantidade(item);
	}

	public void diminuirQuantidade(String item) {
		bean.diminuirQuantidade(item);
	}

}
