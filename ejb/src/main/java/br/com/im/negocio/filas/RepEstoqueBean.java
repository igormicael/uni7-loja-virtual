package br.com.im.negocio.filas;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destinationLoookup", propertyValue = "jms/queue/rQueue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "jms/queue/rQueue") })
public class RepEstoqueBean implements MessageListener {

	@Override
	public void onMessage(Message message) {
		if (message instanceof TextMessage) {
			TextMessage tMsg = (TextMessage) message;
			System.out.println("\n Pedido de reposição de estoque recebido:");
			try {
				System.out.println(tMsg.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
		
	}

}
