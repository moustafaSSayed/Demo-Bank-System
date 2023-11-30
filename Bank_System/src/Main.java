import DAO.AccountOperationsImpl;
import entity.Customer;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer(1, "Moustafa",
                1150, 320000);
        AccountOperationsImpl account = new AccountOperationsImpl();

        System.out.println("The Account Balance is " + customer.getAccountBalance());
        System.out.println("The Interest is " +
                account.calculateInterest(customer , 0.15));
        customer.addDeposit(15000);
        customer.withdrawal(15000);
    }
}