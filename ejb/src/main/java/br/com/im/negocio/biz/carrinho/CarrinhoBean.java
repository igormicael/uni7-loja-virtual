package br.com.im.negocio.biz.carrinho;

import java.util.List;

import javax.ejb.Local;

import br.com.im.negocio.models.ItemEstoque;

@Local
public interface CarrinhoBean {
	
	 List<ItemEstoque> getItens();
	 
	 void adicionarItem(ItemEstoque item);
	 
	 void removerItem(ItemEstoque item);
	 
	 void finalizarCompra();

}
