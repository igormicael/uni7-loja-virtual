package br.com.im.negocio.dao.produtos;

import java.util.List;

import javax.ejb.Local;

import br.com.im.negocio.models.Produto;

@Local
public interface ProdutosDao {

	List<Produto> listar();

}
