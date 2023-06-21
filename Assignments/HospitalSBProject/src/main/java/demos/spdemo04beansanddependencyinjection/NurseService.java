package demos.spdemo04beansanddependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NurseService implements StaffService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public String checkup() {
        return "The nurse is checking up the patient with: " + equipmentRepository.getSupplies();
    }
}
