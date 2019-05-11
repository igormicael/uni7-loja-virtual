package br.com.im.negocio.biz.carrinho;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;

import com.google.gson.Gson;

import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.models.Produto;
import br.com.im.negocio.utils.InfoBean;

@Stateful
public class CarrinhoBeanImpl implements CarrinhoBean {

	private List<ItemEstoque> itensCarrinho;

	@EJB
	private InfoBean infoBean;
	
	@Inject
	private JMSContext context;
	
	@Resource(lookup="java:/jms/queue/pQueue")
	private Queue pQueue;

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
		if (!itensCarrinho.contains(item)) {
			Produto p = infoBean.carregarProduto(item.getProduto());
			item.setProduto(p);
			itensCarrinho.add(item);
		} else {
			ItemEstoque itemEstoque = itensCarrinho.get(itensCarrinho.indexOf(item));
			itemEstoque.aumentarQuantidade(item.getQuantidade());
		}

	}

	@Override
	public void removerItem(ItemEstoque item) {
		ItemEstoque itemEstoque = itensCarrinho.get(itensCarrinho.indexOf(item));
		if (itemEstoque != null) {
			itemEstoque.diminuirQuantidade(item.getQuantidade());
			
			if(itemEstoque.getQuantidade() <= 0) {
				itensCarrinho.remove(itemEstoque);
			}
		}
	}
	
	@Override
	public void limpar() {
		inicializar();
	}

	@Override
	public Boolean finalizarCompra() {

		try {
			
			for (ItemEstoque itemEstoque : getItens()) {
				Boolean estoqueAcabou = infoBean.diminuirDoEstoque(itemEstoque);
				if(estoqueAcabou) {
					
					itemEstoque.setQuantidade(10L);
					
					Gson gson = new Gson();
					
					String pedido = gson.toJson(itemEstoque);
					
					context.createProducer().send(pQueue, pedido);
				}
			}
			
			inicializar();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
