package demos.spdemo08example;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    private String name;
    private String region;

    @Column(name="salary")
    private double dosh;

    public Employee() {
    }

    public Employee(long employeeId, String name, String region, double dosh) {
        this.employeeId = employeeId;
        this.name = name;
        this.region = region;
        this.dosh = dosh;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getDosh() {
        return dosh;
    }

    public void setDosh(double dosh) {
        this.dosh = dosh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return employeeId == employee.employeeId && Double.compare(employee.dosh, dosh) == 0 && Objects.equals(name, employee.name) && Objects.equals(region, employee.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name, region, dosh);
    }

    @Override
    public String toString() {
        return String.format("Employee: employeeId=%s, name=%s, region=%s, dosh=%s", employeeId, name, region, dosh);
    }
}
