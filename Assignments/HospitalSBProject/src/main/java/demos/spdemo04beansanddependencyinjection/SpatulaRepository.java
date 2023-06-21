package demos.spdemo04beansanddependencyinjection;

//@Component
public class SpatulaRepository implements EquipmentRepository{


    @Override
    public String getSupplies(){
        return "Spatula";
    }
}
