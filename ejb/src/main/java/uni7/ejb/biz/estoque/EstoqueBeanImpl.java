package uni7.ejb.biz.estoque;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import uni7.ejb.dao.estoque.EstoqueDao;
import uni7.ejb.models.Estoque;
import uni7.ejb.models.ItemEstoque;

@Stateless
@LocalBean
public class EstoqueBeanImpl implements EstoqueBean {
	
	@Inject
	private EstoqueDao dao;
	
	@PostConstruct
    void postConstruct() {
    	System.out.println("SlBean " + this.toString() + " foi construido!");
    }
    
    @PreDestroy
    void preDestroy() {
    	System.out.println("SlBean " + this.toString() + " será destruido!");
    }

	@Override
	public Estoque listar() {
		return dao.listar();
	}

	@Override
	public void inserirItem(ItemEstoque item) {
		dao.inserirItem(item);
		
	}

}
