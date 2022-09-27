package Section8;

import java.util.ArrayList;

public class Bank {
/**
 * It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
 */
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
/**
 * A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
 */
        this.name = name;
        branches = new ArrayList<Branch>();
    }
/**
 * addBranch(), has one parameter of type String (name of the branch) and returns a boolean.
 * It returns true if the branch was added successfully or false otherwise.
 * @param name
 * @return
 */
    public boolean addBranch(String name) {
        Branch tempBranch = findBranch(name);
        if (tempBranch == null) {
            tempBranch = new Branch(name);
            this.branches.add(tempBranch);
            
            return true;
        } else { 
            return false;
        }
    }
/**
 * addCustomer(), has three parameters of type String (name of the branch), String (name of the customer), double (initial transaction) and returns a boolean.
 * It returns true if the customer was added successfully or false otherwise.
 */
    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null) {
            return tempBranch.newCustomer(nameOfCustomer,transaction);
        } else {
            return false;
        }
    }
/**
 * addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the customer), double (transaction) and returns a boolean.
 * It returns true if the customers transaction was added successfully or false otherwise.
 */
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch tempBranch = findBranch(branchName);
        if (tempBranch!= null) {
            return tempBranch.addCustomerTransaction(customerName, transaction);
        } else {
            return false;
        }
    }
/**
 * findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
 * Return the Branch if it exists or null otherwise.
 */
    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equalsIgnoreCase(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }
/**
 * listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
 * Return true if the branch exists or false otherwise. This method prints out a list of customers.
 */
    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null && printTransactions) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                System.out.println("Transactions");
                for(int j=0; j<tempBranch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + tempBranch.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if(tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
            }
            return true;
        } else {
            return false;
        }
    }

}
