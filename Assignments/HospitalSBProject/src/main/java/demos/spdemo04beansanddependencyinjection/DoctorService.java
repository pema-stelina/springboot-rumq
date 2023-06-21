package demos.spdemo04beansanddependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class DoctorService implements StaffService{

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public String checkup(){
        return "The doctor is checking up the patering with: " + equipmentRepository.getSupplies();

    }

}
