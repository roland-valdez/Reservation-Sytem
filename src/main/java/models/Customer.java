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

}
