package net.rumq.hospitalsbproject.firstPart;

import org.springframework.stereotype.Component;

@Component
public class EyeDepartment {

    public EyeDepartment(){
        System.out.println("Eye department created");
    }

    @Override
    public String toString() {
        return "Hello from the Eye Department";
    }
}
