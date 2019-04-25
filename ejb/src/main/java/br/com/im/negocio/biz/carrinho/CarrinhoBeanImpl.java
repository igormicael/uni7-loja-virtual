package br.com.im.negocio.biz.carrinho;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateful;

@Stateful
public class CarrinhoBeanImpl implements CarrinhoBean{
	
    public CarrinhoBeanImpl() {
	}

	@PostConstruct
    void postConstruct() {
    	System.out.println("postConstruct");
    }
    
    @PreDestroy
    void preDestroy() {
    	System.out.println("preDestroy");
    }
    
    public String acao(String acao) {
    	return "Acao " + acao + " realizada! ";
    }

}
