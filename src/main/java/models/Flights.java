package models;

import javax.persistence.*;

@Entity
@Table(name="flights")
public class Flights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, length = 50)
    private String flight_number;

    @Column(nullable = true, length = 50)
    private String depart_city;

    @Column(nullable = true, length = 100)
    private String depart_state;

    @Column(nullable = true, length = 256)
    private String depart_date;

    @Column(nullable = true, length = 50)
    private String depart_time;

    @Column(nullable = true, length = 50)
    private String arrive_city;

    @Column(nullable = true, length = 50)
    private String arrive_state;

    @Column(nullable = true, length = 50)
    private String arrive_date;

    @Column(nullable = true, length = 50)
    private String arrive_time;

    @Column(nullable = true, length = 50)
    private String passenger_number;

    @Column(nullable = true, length = 50)
    private String travel_time;

}
