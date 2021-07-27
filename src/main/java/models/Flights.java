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

    public Flights(){};

    public Flights(Flights copy){
        id = copy.id;
        flight_number = copy.flight_number;
        depart_city = copy.depart_city;
        depart_state = copy.depart_state;
        depart_date = copy.depart_date;
        depart_time = copy.depart_time;
        arrive_city = copy.arrive_city;
        arrive_state = copy.arrive_state;
        arrive_date = copy.arrive_date;
        arrive_time = copy.arrive_time;
        passenger_number = copy.passenger_number;
        travel_time = copy.travel_time;


    }

    public Flights(long id, String flight_number, String depart_city, String depart_state, String depart_date, String depart_time, String arrive_city, String arrive_state, String arrive_date, String arrive_time, String passenger_number, String travel_time) {
        this.id = id;
        this.flight_number = flight_number;
        this.depart_city = depart_city;
        this.depart_state = depart_state;
        this.depart_date = depart_date;
        this.depart_time = depart_time;
        this.arrive_city = arrive_city;
        this.arrive_state = arrive_state;
        this.arrive_date = arrive_date;
        this.arrive_time = arrive_time;
        this.passenger_number = passenger_number;
        this.travel_time = travel_time;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public String getDepart_city() {
        return depart_city;
    }

    public void setDepart_city(String depart_city) {
        this.depart_city = depart_city;
    }

    public String getDepart_state() {
        return depart_state;
    }

    public void setDepart_state(String depart_state) {
        this.depart_state = depart_state;
    }

    public String getDepart_date() {
        return depart_date;
    }

    public void setDepart_date(String depart_date) {
        this.depart_date = depart_date;
    }

    public String getDepart_time() {
        return depart_time;
    }

    public void setDepart_time(String depart_time) {
        this.depart_time = depart_time;
    }

    public String getArrive_city() {
        return arrive_city;
    }

    public void setArrive_city(String arrive_city) {
        this.arrive_city = arrive_city;
    }

    public String getArrive_state() {
        return arrive_state;
    }

    public void setArrive_state(String arrive_state) {
        this.arrive_state = arrive_state;
    }

    public String getArrive_date() {
        return arrive_date;
    }

    public void setArrive_date(String arrive_date) {
        this.arrive_date = arrive_date;
    }

    public String getArrive_time() {
        return arrive_time;
    }

    public void setArrive_time(String arrive_time) {
        this.arrive_time = arrive_time;
    }

    public String getPassenger_number() {
        return passenger_number;
    }

    public void setPassenger_number(String passenger_number) {
        this.passenger_number = passenger_number;
    }

    public String getTravel_time() {
        return travel_time;
    }

    public void setTravel_time(String travel_time) {
        this.travel_time = travel_time;
    }
}
