package address.data;

/**
 * Our custom data type, AddressEntry which has a name, street, city, state, zip, phone, and email
 * @author Victor Ly
 * @since 1.0 Exercise 2
 */
public class AddressEntry
{
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String telephone;
    private String email;


    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.telephone = telephone;
        this.email = email;
    }

    /**
     * Getter method for firstName attribute of an AddressEntry
     * @author Victor Ly
     * @return firstName
     * @since 1.0 Exercise 2
     */
    public String getFirstName() {return firstName;}

    /**
     * Getter method for lastName attribute of an AddressEntry
     * @author Victor Ly
     * @return lastName
     * @since 1.0 Exercise 2
     */
    public String getLastName() {return lastName;}

    /**
     * Getter method for Street attribute of an AddressEntry
     * @author Victor Ly
     * @return street
     * @since 1.0 Exercise 2
     */
    public String getStreet() {return street;}

    /**
     * Getter method for City attribute of an AddressEntry
     * @author Victor Ly
     * @return city
     * @since 1.0 Exercise 2
     */
    public String getCity() {return city;}

    /**
     * Getter method for State attribute of an AddressEntry
     * @author Victor Ly
     * @return state
     * @since 1.0 Exercise 2
     */
    public String getState() {return state;}

    /**
     * Getter method for Zip attribute of an AddressEntry
     * @author Victor Ly
     * @return zip
     * @since 1.0 Exercise 2
     */
    public String getZip() {return zip;}

    /**
     * Getter method for Telephone attribute of an AddressEntry
     * @author Victor Ly
     * @return telephone
     * @since 1.0 Exercise 2
     */
    public String getTelephone() {return telephone;}

    /**
     * Getter method for Email attribute of an AddressEntry
     * @author Victor Ly
     * @return email
     * @since 1.0 Exercise 2
     */
    public String getEmail() {return email;}

    /**
     * @author Victor Ly
     * @param firstName AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setFirstName(String firstName) {this.firstName = firstName;}

    /**
     * @author Victor Ly
     * @param lastName AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setLastName(String lastName) {this.lastName = lastName;}

    /**
     * @author Victor Ly
     * @param street AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setStreet(String street) {this.street = street;}

    /**
     * @author Victor Ly
     * @param city AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setCity(String city) {this.city = city;}

    /**
     * @author Victor Ly
     * @param state AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setState(String state) {this.state = state;}

    /**
     * @author Victor Ly
     * @param zip AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setZip(String zip) {this.zip = zip;}

    /**
     * @author Victor Ly
     * @param telephone AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setTelephone(String telephone) {this.telephone = telephone;}

    /**
     * @author Victor Ly
     * @param email AddressEntry attribute
     * @since 1.0 Exercise 2
     */
    public void setEmail(String email) {this.email = email;}

    /**
     * @author Victor Ly
     * @return Override toString to cleanly print all the attributes of an AddressEntry
     * @since 1.0 Exercise 2
     */
    public String toString()
    {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nStreet: " + street + "\nCity: " + city + "\nState: "
                + state + "\nZip: " + zip +  "\nTelephone: " + telephone + "\nEmail: " + email + "\n" + "\n";
    }
}

