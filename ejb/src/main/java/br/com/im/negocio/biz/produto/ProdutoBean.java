package br.com.im.negocio.biz.produto;

import java.util.List;

import javax.ejb.Local;

import br.com.im.negocio.models.Produto;

@Local
public interface ProdutoBean {

	List<Produto> listar();

}
