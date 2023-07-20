package net.rumq.hospitalsbproject.firstPartConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class QualifierAutowiredDI {

    @Autowired
    @Qualifier("doctor")
    private Staff staff1;

    @Autowired
    @Qualifier("nurse")
    private Staff staff2;

    @Autowired
    @Qualifier("receptionist")
    private Staff staff3;

    @Autowired
    private Collection<Staff> staff;

    @Autowired
    private Map<String, Staff> staffMap;

    public QualifierAutowiredDI () {
        System.out.println("QualifierAutowiredDI");
    }

    @Override
    public String toString() {
        return "QualifierAutowiredDi{" +
                "staff1=" + staff1 +
                ", staff2=" + staff2 +
                ", staff3=" + staff3 +
                ", staff=" + staff +
                ", staffMap=" + staffMap +
                '}';
    }
}


interface Staff {
    public String getStaff();
}


@Component
class Doctor implements Staff {

    public Doctor(){
        System.out.println("Doctor created");
    }

    @Override
    public String toString() {
        return "Hello from Doctor";
    }

    @Override
    public String getStaff(){
        return "Doctor";
    }
}



@Component
class Nurse implements Staff {

    public Nurse(){
        System.out.println("Nurse created");
    }

    @Override
    public String getStaff(){
        return "Nurse";
    }



    @Override
    public String toString() {
        return "Hello from Nurse";
    }
}

@Component
class Receptionist implements Staff {

    public Receptionist (){
        System.out.println("Receptionist created");
    }

    @Override
    public String toString() {
        return "Hello from Receptionist";
    }

    @Override
    public String getStaff(){
        return "Receptionist";
    }
}