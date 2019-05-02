package br.com.im.negocio.dao.estoque;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.utils.InfoBean;

@Stateless
public class EstoqueDaoImpl implements EstoqueDao{
	
	@EJB
	private InfoBean infoBean;

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

}
