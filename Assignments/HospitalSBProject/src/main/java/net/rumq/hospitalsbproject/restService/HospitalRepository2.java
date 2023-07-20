package net.rumq.hospitalsbproject.restService;

import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class HospitalRepository2 {
    long nextId = 1;
    private Map<Long, Hospital> catalog = new HashMap<>();

    {
        insert(new Hospital(1L, "Hospital1", "Tirane"));
        insert(new Hospital(2L, "Hospital2", "Kuçove"));
        insert(new Hospital(3L, "Hospital3", "Fier"));
        insert(new Hospital(4L, "Hospital4", "Kruje"));
    }

    public Collection<Hospital> getAll(){
        return catalog.values();
    }

    public  Hospital getById(long id) {
        return catalog.get(id);
    }

    public Hospital insert(Hospital hospital){
        hospital.setId(nextId++);
        catalog.put((hospital.getId()), hospital);
        return hospital;
    }
}
