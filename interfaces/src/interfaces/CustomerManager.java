package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	
	//loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFistName());
		
		Utils.runLoggers(loggers, customer.getFistName()); 
		
		
	}
	public void  delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFistName());
		
		Utils.runLoggers(loggers, customer.getLastName()); 

	}

	}

//Simple is Best !!