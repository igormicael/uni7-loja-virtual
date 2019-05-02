package br.com.im.negocio.biz.estoque;

import javax.ejb.Local;

import br.com.im.negocio.models.Estoque;

@Local
public interface EstoqueBean {
	
	Estoque listar();

	void aumentarQuantidade(String item);

	void diminuirQuantidade(String item);


}
