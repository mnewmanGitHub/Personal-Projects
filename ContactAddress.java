public class ContactAddress {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public ContactAddress(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public ContactAddress() {
        this.street = null;
        city = null;
        state = null;
        zipCode = null;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String toString() {
        return street + " " + city + ", " + state + zipCode;
    }
}
