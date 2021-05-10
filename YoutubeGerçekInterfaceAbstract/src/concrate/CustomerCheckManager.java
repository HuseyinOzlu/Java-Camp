package concrate;

import Abstract.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;

		
	
	}

}
