package demo.spdemo04beansanddependencyinjection;

import org.springframework.stereotype.Component;

//@Component
public class SpatulaRepository implements EquipmentRepository{


    @Override
    public String getSupplies(){
        return "Spatula";
    }
}
