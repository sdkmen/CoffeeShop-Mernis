package Abstracts;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	void save(Customer customer) throws NumberFormatException, RemoteException;
}
