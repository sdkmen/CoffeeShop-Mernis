

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Name", "LastName", 2000 , "12345678900"));
	}

}
