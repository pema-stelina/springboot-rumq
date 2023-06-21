package demos.spdemo06configurationclasses;

public class Doctor {

    private int salary;

    public Doctor(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "salary=" + salary +
                '}';
    }
}
