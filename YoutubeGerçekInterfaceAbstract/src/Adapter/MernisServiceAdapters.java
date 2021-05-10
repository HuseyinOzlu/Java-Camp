package Adapter;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements CustomerCheckService {
	
		

		@Override
		public boolean checkIfRealPerson(Customer customer) throws RemoteException  {
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();			
			return client.TCKimlikNoDogrula(customer.getNationalityId(), customer.firstName.toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		}

}
