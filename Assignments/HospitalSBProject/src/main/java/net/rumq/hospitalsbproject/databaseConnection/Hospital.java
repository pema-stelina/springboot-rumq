package net.rumq.hospitalsbproject.databaseConnection;


import net.rumq.hospitalsbproject.firstPartConcepts.EarDepartment;
import net.rumq.hospitalsbproject.firstPartConcepts.EyeDepartment;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.*;

@Entity
@Table(name="HOSPITALS")

public class Hospital {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hospitalId = -1;
    private String name;
    private String city;

    public Hospital(long hospitalId, String name, String city) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.city = city;
//        this.eyeDepartment = eyeDepartment;
//        this.earDepartment = earDepartment;
    }

    public Hospital() {
    }

    public long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(long hospitalId) {
        this.hospitalId = hospitalId;
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

    public EyeDepartment getEyeDepartment() {
        return eyeDepartment;
    }

    public void setEyeDepartment(EyeDepartment eyeDepartment) {
        this.eyeDepartment = eyeDepartment;
    }

    public EarDepartment getEarDepartment() {
        return earDepartment;
    }

    public void setEarDepartment(EarDepartment earDepartment) {
        this.earDepartment = earDepartment;
    }

    @Autowired
    private EyeDepartment eyeDepartment;
    private EarDepartment earDepartment;


    public Hospital(EarDepartment earDepartment){
        System.out.println("Hospital created " + this.hashCode());
        this.earDepartment=earDepartment;

    }


    @Override
    public String toString() {
      return String.format("Hello from our Hospital, \n" + "We have an Eye department. Our staff says %s, \n" + "We also have an ear department and our staff says %s \n" +
                      "Our hospital's hashcode is %s" ,
              eyeDepartment, earDepartment, this.hashCode());


    }
}
