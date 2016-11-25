import org.apache.activemq.ActiveMQConnectionFactory;
 
import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
 

public class Exercise1 {
	
	public static final String TEXT = "";
 
    public static void main(String[] args) throws Exception {
    	// Create a ConnectionFactory
    	ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
    	
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        Thread.sleep(5000);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleConsumer(connectionFactory), false);
        thread(new SimpleProducer(connectionFactory), false);
    }
 
    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }
 
    public static class SimpleProducer implements Runnable {
    	
    	private ActiveMQConnectionFactory connectionFactory;
    	
    	public SimpleProducer(ActiveMQConnectionFactory connectionFactory) {
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
 
    public static class SimpleConsumer implements Runnable, ExceptionListener {
    	
    	private ActiveMQConnectionFactory connectionFactory;
    	
    	public SimpleConsumer(ActiveMQConnectionFactory connectionFactory) {
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