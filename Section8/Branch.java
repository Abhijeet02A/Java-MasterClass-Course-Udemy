package Section8;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction) {
        Customer customer = findCustomer(name);
        
        if (customer == null) {
            Customer tempCustomer = new Customer(name, transaction);
            this.customers.add(tempCustomer);
            return true;
        } else {
            return false;
        }
        
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer tempCustomer = findCustomer(customerName);
        if (tempCustomer != null) {
            tempCustomer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equalsIgnoreCase(customerName)) {
                return c;
            }
        }
        return null;
    }
}
