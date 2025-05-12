package at.fhj.msd.contact;

import java.util.Comparator;

public class ContactByFirstNameComparator implements Comparator<Contact>{

    @Override
    public int compare(Contact c1, Contact c2) {

        if (c1.firstName.equals(c2.firstName)) {
            return c1.lastName.compareTo(c2.lastName);
        }

        return c1.firstName.compareTo(c2.firstName);
    }
    
}
