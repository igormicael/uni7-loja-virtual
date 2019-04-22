package uni7.ejb.biz.estoque;

import uni7.ejb.models.Estoque;
import uni7.ejb.models.ItemEstoque;

public interface EstoqueBean {
	
	Estoque listar();
	
	void inserirItem(ItemEstoque item);

}
