package net.rumq.hospitalsbproject.firstPartConcepts;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeComponent {

    public PrototypeComponent(){
        System.out.println("Prototype created");
    }

    @Override
    public String toString() {
        return "Hello from Prototype Component";
    }
}
