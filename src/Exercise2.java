import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class Exercise2 {
	public static void main(String[] args) throws Exception {
    	ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
    	
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectConsumer(connectionFactory), false);
        thread(new ObjectProducer(connectionFactory), false);
    }
 
    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }
 
    public static class ObjectProducer implements Runnable {
    	
    	private ActiveMQConnectionFactory connectionFactory;
    	
    	public ObjectProducer(ActiveMQConnectionFactory connectionFactory) {
    		this.connectionFactory = connectionFactory;
    	}
    	
        public void run() {
            try {
            	 /**TO DO**/
            }
            catch (Exception e) {
            }
        }
    }
 
    public static class ObjectConsumer implements Runnable, ExceptionListener {
    	
    	private ActiveMQConnectionFactory connectionFactory;
    	
    	public ObjectConsumer(ActiveMQConnectionFactory connectionFactory) {
    		this.connectionFactory = connectionFactory;
    	}
    	
        public void run() {
            try {
 
            	 /**TO DO**/
            } catch (Exception e) {
            }
        }
 
        public synchronized void onException(JMSException ex) {
            System.out.println("JMS Exception occured.  Shutting down client.");
        }
    }
}
