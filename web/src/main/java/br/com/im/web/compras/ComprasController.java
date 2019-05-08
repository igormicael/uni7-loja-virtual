package br.com.im.web.compras;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;

import br.com.im.negocio.biz.carrinho.CarrinhoBean;
import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.models.Produto;

public class ComprasController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5553943117030531059L;
	
	@EJB
	private CarrinhoBean bean;
	
	public List<ItemEstoque> getItens() {
		return bean.getItens();
	}
	
	public void adicionarItem(String produto, String quantidade) {
		
		ItemEstoque item = contruirItemEstoque(produto, quantidade);
		
		bean.adicionarItem(item);
	}
	
	public void removerItem(String produto, String quantidade) {
		
		ItemEstoque item = contruirItemEstoque(produto, quantidade);
		
		bean.removerItem(item);
	}

	private ItemEstoque contruirItemEstoque(String produto, String quantidade) {
		Produto p = new Produto();
		p.setId(Long.valueOf(produto));
		
		ItemEstoque item = new ItemEstoque();
		item.setProduto(p);
		item.setQuantidade(Long.valueOf(quantidade));
		return item;
	}
	
	public void finalizarCompra() {
		bean.finalizarCompra();
	}

}
