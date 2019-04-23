package br.com.im.negocio.models;

import java.util.List;

public class Estoque {
	
	private Long id;
	private List<ItemEstoque> itens;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public List<ItemEstoque> getItens() {
		return itens;
	}
	public void setItens(List<ItemEstoque> itens) {
		this.itens = itens;
	}
}