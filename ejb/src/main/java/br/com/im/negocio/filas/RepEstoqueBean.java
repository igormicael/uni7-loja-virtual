package br.com.im.negocio.filas;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import com.google.gson.Gson;

import br.com.im.negocio.models.ItemEstoque;
import br.com.im.negocio.utils.InfoBean;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destinationLoookup", propertyValue = "jms/queue/rQueue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/queue/rQueue") })
public class RepEstoqueBean implements MessageListener {
	
	@EJB
	private InfoBean infoBean;

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage tMsg = (TextMessage) message;
			System.out.println("\n Pedido de reposição de estoque recebido.");
			try {
				
				ItemEstoque fromJson = new Gson().fromJson(tMsg.getText(), ItemEstoque.class);
				
				infoBean.adicionarNoEstoque(fromJson);
				
				System.out.println(tMsg.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
		
	}

}
