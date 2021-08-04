package coffeeShopManagement;

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
		
		//id - FirstName - Last Name - Birth Year - Nationality ID
		customerManager.save(new Customer(1, "Seyfullah Veli", "Dikmen", 2001 , "11111111111"));
	}

}
