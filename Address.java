public class Address {
    //Attributes
    private String street;
    private String district;
    private String postcode;
    private String state;
    private String address;

    // constuctor 1
    public Address() {
        System.out.println("An address is constructed");
    }

    // constuctor 2
    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }

    //getter & setter
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress(){
        address = street + "," + district + "," + postcode + "," + state;
        return address;
    }
}