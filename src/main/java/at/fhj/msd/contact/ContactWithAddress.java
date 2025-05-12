package at.fhj.msd.contact;

import at.fhj.msd.address.Address;

public class ContactWithAddress extends Contact {

    protected Address address;

    public ContactWithAddress(String firstName, String lastName, Address address) {
        super(firstName, lastName);
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s", this.lastName, this.firstName, this.address.toString());
    }

    public Address getAddress() {
        return this.address;
    }

}