package models;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, length = 50)
    private String first_name;

    @Column(nullable = true, length = 50)
    private String last_name;

    @Column(nullable = true, length = 100)
    private String email;

    @Column(nullable = true, length = 256)
    private String street;

    @Column(nullable = true, length = 50)
    private String city;

    @Column(nullable = true, length = 50)
    private String state;

    @Column(nullable = true, length = 50)
    private String zipcode;

    @Column(nullable = true, length = 50)
    private String country;

    public Customer(){};

    public Customer(Customer copy){
        id = copy.id;
        first_name = copy.first_name;
        last_name = copy.last_name;
        email = copy.email;
        street = copy.street;
        city = copy.city;
        state = copy.state;
        zipcode = copy.zipcode;
        country = copy.country;
    }
    public Customer(long id, String first_name, String last_name, String email, String street, String city, String state, String zipcode, String country) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
