package br.com.im.negocio.utils;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.im.negocio.dao.estoque.EstoqueDao;
import br.com.im.negocio.models.Estoque;

@Startup
@Singleton
public class InfoBean {
	
	@EJB
	private EstoqueDao estoqueDao;
	
	private Estoque estoque;
	
	@PostConstruct
	public void inicializar() {
		estoque = estoqueDao.listar();
	}

	public Estoque getEstoque() {
		return estoque;
	}

}
