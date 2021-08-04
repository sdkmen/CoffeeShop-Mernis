package Concrete;

import java.rmi.RemoteException;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
	}
}
