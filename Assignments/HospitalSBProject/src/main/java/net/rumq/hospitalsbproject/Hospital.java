package net.rumq.hospitalsbproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("StelinasComponent")
@Scope("singleton")
@Lazy(true)

public class Hospital {


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
