package br.com.im.negocio.biz.estoque;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.im.negocio.dao.estoque.EstoqueDao;
import br.com.im.negocio.models.Estoque;
import br.com.im.negocio.models.ItemEstoque;

@Stateless
public class EstoqueBeanImpl implements EstoqueBean{
	
	@EJB
	private EstoqueDao dao;
	
	@PostConstruct
    void postConstruct() {
    	System.out.println("postConstruct");
    }
    
    @PreDestroy
    void preDestroy() {
    	System.out.println("preDestroy");
    }

	public Estoque listar() {
		return dao.listar();
	}

	public void inserirItem(ItemEstoque item) {
		dao.inserirItem(item);
		
	}

}
