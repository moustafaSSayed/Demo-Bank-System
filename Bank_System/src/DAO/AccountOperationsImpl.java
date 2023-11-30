package DAO;

import entity.Customer;

public class AccountOperationsImpl implements AccountOperations{

    @Override
    public double calculateInterest(Customer customer, double interestRate) {
        return customer.getAccountBalance() * interestRate;
    }
}
