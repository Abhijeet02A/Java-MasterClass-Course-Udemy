package Section8;

import java.util.ArrayList;

/**
 * Implement the master class MobilePhone, 
 * that holds the ArrayList of Contacts, with the following attributes:
 * Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
 */
public class MobilePhone {
   private String myNumber;
   private ArrayList<Contact> myContacts = new ArrayList<Contact>();

/**
 * A constructor that takes a String (the phone number) 
 * and initialises myNumber and instantiates myContacts.
 */
    public MobilePhone(final String phoneNumber) {
        this.myNumber = phoneNumber;
    }
/**
 * addNewContact(), has one parameter of type Contact and returns a boolean. 
 * Returns true if the contact doesn't exists, or false if the contact already exists.
 */
    public boolean addNewContact(final Contact newContact) {
        if (findContact(newContact.getName()) >= 0) {
            return false;
        } else {
            myContacts.add(newContact);
            return true;
        }
    }
/**
 * updateContact(), has two parameters of type Contact (the old contact that will be 
 * updated with the new contact) and returns a boolean. 
 * Returns true if the contact exists and was updated successfully, 
 * or false if the contact doesn't exists.
 */
    public  boolean updateContact(final Contact oldContact, final Contact NewContact) {
        if (this.myContacts.contains(oldContact)) {
            this.myContacts.add(this.myContacts.indexOf(oldContact), NewContact);
            return true;
        } else {
            return false;
        }
    }
/**
 * removeContact(), has one parameter of type Contact and returns a boolean. 
 * Returns true if the contact exists and was removed successfully, 
 * or false if the contact doesn't exists.
 */
    public  boolean removeContact(final Contact contact) {
        int index = findContact(contact);
        if (index >= 0) {
            this.myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }
/**
 * findContact(), has one parameter of type Contact and returns an int. 
 * The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists)
 * or a value greater than or equal to 0 (does exists).
 */
    private  int findContact(final Contact findContact) {
        return this.myContacts.indexOf(findContact);
    }
/**
 * findContact(), same as above, only it has one parameter of type String.
 */
    private  int findContact(final String contactName) {
        Contact c;
        for (int i = 0; i < myContacts.size(); i++) {
            c = (Contact) myContacts.get(i);
            if (c.getName().equalsIgnoreCase(contactName)) {
                return myContacts.indexOf(c);
            }
        }
        return -1;
    }
/**
 * queryContact(), has one parameter of type String and returns a Contact. 
 * Use the String to search for the name and then return the Contact. Return null otherwise.
 */
    public  Contact queryContact(final String name) {
        int index = findContact(name);
        if (index >= 0) {
            return (Contact)myContacts.get(index);
        } else {
            return null;
        }
    }
/**
 * printContacts(), has no parameters and doesn't return anything. 
 * Print the contacts in the following format:
    Contact List:
    1. Bob -> 31415926
    2. Alice -> 16180339
    3. Tom -> 11235813
    4. Jane -> 23571113
 */
    public  void printContacts() {
        System.out.println("Contact List:");
        /*
        for (int i = 0; i < myContacts.size(); i++) {
                System.out.println(i+1 + ". " + myContacts.get(i).getName()
                 + " -> " + myContacts.get(i).getPhoneNumber());
            }
        */
        for (Contact contact : myContacts) {
            System.out.println(myContacts.indexOf(contact)+1 +". " + contact.getName() + " -> " 
            + contact.getPhoneNumber());
        }
        }
}
