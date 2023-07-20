package demos.spdemo08example;


import jakarta.persistence.*;

@Table(name="CARS")
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long carId = -1;

    private String registrationNumber;
    private String make;
    private String model;

    public Car(long carId, String registrationNumber, String make, String model) {
        this.carId = carId;
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
    }


    public Car() {
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
