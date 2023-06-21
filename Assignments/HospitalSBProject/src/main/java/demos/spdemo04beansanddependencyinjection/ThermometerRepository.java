package demos.spdemo04beansanddependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class ThermometerRepository implements EquipmentRepository {


    @Override
    public String getSupplies(){
        return "Thermometer";
    }

}
