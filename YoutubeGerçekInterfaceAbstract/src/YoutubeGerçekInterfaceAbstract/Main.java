
package YoutubeGerçekInterfaceAbstract;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapters;
import concrate.StarbucksCustomerManager;
import entities.Customer;

public class Main {
	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
		customerManager.save(new Customer(1, "Hüseyin", "Özlü", LocalDate.of(2002, 3, 29), 999999));
		System.out.println();
		
	}
}
