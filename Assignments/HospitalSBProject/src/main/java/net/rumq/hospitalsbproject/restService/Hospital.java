package net.rumq.hospitalsbproject.restService;

import jakarta.persistence.*;

@Entity
@Table(name = "HOSPITALS")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id = -1;
    private String name;
    private String city;

    public Hospital(long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Hospital() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
