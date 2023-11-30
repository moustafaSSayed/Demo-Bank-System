package entity;

public class Customer {
    private int customerId;
    private String customerName;
    private double accountNumber;
    private double accountBalance;

    //create constructors
    public Customer() {
    }

    public Customer(int customerId, String customerName, double accountNumber, double accountBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    //create getters and setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addDeposit(double deposit) {
        if(deposit > 0 )
            accountBalance += deposit;
        System.out.println("The New Account Balance is " +accountBalance);
    }


    public void withdrawal(double amount) {
        if(amount > 0 && amount < accountBalance)
            accountBalance -= amount;
        System.out.println("The New Account Balance is " +accountBalance);
    }
}
