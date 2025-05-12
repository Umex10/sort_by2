package at.fhj.msd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import at.fhj.msd.address.Address;
import at.fhj.msd.contact.Contact;
import at.fhj.msd.contact.ContactByFirstNameComparator;
import at.fhj.msd.contact.ContactByLastNameComparator;
import at.fhj.msd.contact.ContactWithAddress;
import at.fhj.msd.contact.ContactWithAddressComparator;

/**
 * @author Umejr Dzinovic
 */
public class App {

    public static void main(String[] args) {

        System.out.println("-----------------------------UNSORTED-----------------------------");

        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Alex", "Muster"));
        contacts.add(new Contact("John", "Doe"));
        contacts.add(new Contact("Jane", "Doe"));
        contacts.add(new ContactWithAddress("Mary", "Sheep", new Address("Somestreet 12", "Otherplace", 12345)));
        contacts.add(new ContactWithAddress("Harry", "Alberto", new Address("Nanoway 4", "Thisanto", 4432)));

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println();
        System.out.println("-----------------------------FIRST-----------------------------");

        ContactByFirstNameComparator compFirstName = new ContactByFirstNameComparator();
        ContactByLastNameComparator compLastName = new ContactByLastNameComparator();

        Collections.sort(contacts, compFirstName);

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println();
        System.out.println("-----------------------------SECOND-----------------------------");

        Collections.sort(contacts, compLastName);

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

        System.out.println();
        System.out.println("-----------------------------ContactWithAddress-----------------------------");

        ContactWithAddressComparator compAddress = new ContactWithAddressComparator();

        Collections.sort(contacts, compAddress);

        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }
}
