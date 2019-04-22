package uni7.ejb.dao.estoque;

import uni7.ejb.models.Estoque;
import uni7.ejb.models.ItemEstoque;

public interface EstoqueDao {

	Estoque listar();

	void inserirItem(ItemEstoque item);

}
