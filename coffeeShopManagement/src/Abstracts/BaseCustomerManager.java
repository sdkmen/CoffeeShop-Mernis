package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("saved to db: " + customer.getFirstName());
	}

}
