package uni7.ejb.dao.produtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import uni7.ejb.models.Produto;

@ApplicationScoped
public class ProdutosDaoImpl implements ProdutosDao {

	List<Produto> lista = null;
	
	@PostConstruct
	public void inicializar() {
		lista = new ArrayList<>();
		
		lista.add(new Produto(1L, "Arroz", BigDecimal.ONE));
		lista.add(new Produto(2L, "Feijão", BigDecimal.ONE));
		lista.add(new Produto(3L, "Macarrão", BigDecimal.ONE));
	}
	
	@Override
	public List<Produto> listar() {
		return lista;
	}

}
