package net.rumq.hospitalsbproject.firstPartConcepts;

import org.springframework.stereotype.Component;

@Component
public class EarDepartment {

    public EarDepartment(){
        System.out.println("Ear department created");
    }

    @Override
    public String toString() {
        return "Hello from the Ear Department";
    }
}
