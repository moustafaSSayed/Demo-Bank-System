package DAO;

import entity.Customer;

public interface AccountOperations {

    public double calculateInterest(Customer customer, double interestRate);


}
