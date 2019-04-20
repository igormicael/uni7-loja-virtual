package uni7.ejb.estoque;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class EstoqueBeanImpl implements EstoqueBean {
	
    public EstoqueBeanImpl() {
	}

	@PostConstruct
    void postConstruct() {
    	System.out.println("SlBean " + this.toString() + " foi construido!");
    }
    
    @PreDestroy
    void preDestroy() {
    	System.out.println("SlBean " + this.toString() + " será destruido!");
    }
    
    @Override
    public String acao(String acao) {
    	return "Acao " + acao + " realizada! ";
    }

}
