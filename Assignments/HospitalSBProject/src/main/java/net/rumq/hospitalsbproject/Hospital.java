package net.rumq.hospitalsbproject;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("StelinasComponent")
@Scope("singleton")
@Lazy(true)
public class Hospital {

    public Hospital(){
        System.out.println("Hospital created " + this.hashCode());

    }

    @Override
    public String toString() {
      return "Hello from Hospital " + this.hashCode();
    }
}
