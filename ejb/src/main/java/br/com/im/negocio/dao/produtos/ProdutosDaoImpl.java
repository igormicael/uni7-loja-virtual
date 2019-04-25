package br.com.im.negocio.dao.produtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

import br.com.im.negocio.models.Produto;

@Stateless
public class ProdutosDaoImpl implements ProdutosDao{

	List<Produto> lista = null;
	
	@PostConstruct
	public void inicializar() {
		lista = new ArrayList<>();
		
		lista.add(new Produto(1L, "Arroz", BigDecimal.ONE));
		lista.add(new Produto(2L, "Feijão", BigDecimal.ONE));
		lista.add(new Produto(3L, "Macarrão", BigDecimal.ONE));
	}
	
	public List<Produto> listar() {
		return lista;
	}

}
