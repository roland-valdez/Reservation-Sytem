package models;


import javax.persistence.*;

@Entity
@Table(name = "confirmations")
public class Confirmations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, length = 50)
    private String confirmation_number;
}
