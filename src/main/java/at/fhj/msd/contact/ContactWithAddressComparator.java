package at.fhj.msd.contact;

import java.util.Comparator;

import at.fhj.msd.address.Address;

public class ContactWithAddressComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact c1, Contact c2) {

        boolean c1HasAddress = c1 instanceof ContactWithAddress;
        boolean c2HasAddress = c2 instanceof ContactWithAddress;

        if (c1HasAddress && !c2HasAddress) {
            return -1; 
        }
        if (!c1HasAddress && c2HasAddress) {
            return 1; 
        }
        if (!c1HasAddress && !c2HasAddress) {
           
            return c1.getLastName().compareTo(c2.getLastName());
        }

        Address a1 = ((ContactWithAddress) c1).getAddress();
        Address a2 = ((ContactWithAddress) c2).getAddress();

        int streetComp = a1.getStreet().compareTo(a2.getStreet());

        if (streetComp != 0) {
            return streetComp;
        }

        int placeCop = a1.getPlace().compareTo(a2.getPlace());

        if (placeCop != 0) {
            return placeCop;
        }

        return Integer.compare(a1.getZip(), a2.getZip());

    }

}
