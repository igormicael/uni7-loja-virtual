package br.com.im.negocio.biz.estoque;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.utils.InfoBean;

@Stateless
public class EstoqueBeanImpl implements EstoqueBean{
	
	@EJB
	private InfoBean infoBean;

	@Override
	public Estoque listar() {
		return infoBean.getEstoque();
	}

	public void inserirItem(ItemEstoque item) {
		if(infoBean.getEstoque() != null) {
			infoBean.getEstoque().adicionarItem(item);
		}
	}
	
	public void removerItem(ItemEstoque item) {
		if(infoBean.getEstoque() != null && infoBean.getEstoque().getItens() != null) {
			infoBean.getEstoque().removerItem(item);
		}
	}

	@Override
	public void adicionarItem(String item) {
		for (ItemEstoque i : listar().getItens()) {
			if(i.getId() == Long.parseLong(item)) {
				i.aumentarQuantidade();
			}
		}
	}

	@Override
	public void diminuirItem(String item) {
		for (ItemEstoque i : listar().getItens()) {
			if(i.getId() == Long.parseLong(item)) {
				i.diminuirQuantidade();;
			}
		}
	}

}
