package at.fhj.msd.address;

public class Address {

    protected String street;
    protected String place;
    protected int zip;

    public Address(String street, String place, int zip) {
        this.street = street;
        this.place = place;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s; %d", this.street, this.place, this.zip);
    }

    public String getStreet() {
        return this.street;
    }

    public String getPlace() {
        return this.place;
    }

    public int getZip() {
        return this.zip;
    }

}