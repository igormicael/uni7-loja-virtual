package br.com.im.negocio.biz.carrinho;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class CarrinhoBeanImpl implements CarrinhoBean {
	
    public CarrinhoBeanImpl() {
	}

	@PostConstruct
    void postConstruct() {
    	System.out.println("SlBean " + this.toString() + " foi construido!");
    }
    
    @PreDestroy
    void preDestroy() {
    	System.out.println("SlBean " + this.toString() + " ser� destruido!");
    }
    
    @Override
    public String acao(String acao) {
    	return "Acao " + acao + " realizada! ";
    }

}