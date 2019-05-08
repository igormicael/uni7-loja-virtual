package br.com.im.negocio.biz.carrinho;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

import br.com.im.negocio.models.ItemEstoque;

@Stateful
public class CarrinhoBeanImpl implements CarrinhoBean{
	
	private List<ItemEstoque> itensCarrinho;
	
	@PostConstruct
	public void inicializar() {
		itensCarrinho = new ArrayList<>();
	}

	@Override
	public List<ItemEstoque> getItens() {
		return itensCarrinho;
	}

	@Override
	public void adicionarItem(ItemEstoque item) {
		if(!itensCarrinho.contains(item)) {
			itensCarrinho.add(item);
		}else {
			ItemEstoque itemEstoque = itensCarrinho.get(itensCarrinho.indexOf(item));
			itemEstoque.aumentarQuantidade();
		}
		
	}

	@Override
	public void removerItem(ItemEstoque item) {
		if(!itensCarrinho.contains(item)) {
			itensCarrinho.add(item);
		}else {
			ItemEstoque itemEstoque = itensCarrinho.get(itensCarrinho.indexOf(item));
			itemEstoque.diminuirQuantidade();
		}
	}

	@Override
	public void finalizarCompra() {
		// A ser feito
	}
	

}
