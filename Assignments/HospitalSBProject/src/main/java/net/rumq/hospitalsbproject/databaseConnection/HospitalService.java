package net.rumq.hospitalsbproject.databaseConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public long getHospitalCount(){
//        return getHospitalCount();
        return hospitalRepository.count();
    }

    public Optional<Hospital> getHospital(long hospitalId){
//        return getHospital();
        return hospitalRepository.findById(hospitalId);
    }

    public List<Hospital> getHospitals(){
//        return getHospitals();
        List<Hospital> hospitals = new ArrayList<>();
        hospitalRepository.findAll().forEach(hospitals::add);
        return hospitals;
    }

    public void insertHospital(Hospital hospital){
//       hospitalRepository.insertHospital(hospital);
        hospitalRepository.save(hospital);
    }

    public void updateHospital(Long id, String hospitalName){
//      hospitalRepository.delete(id, hospitalName);
        Hospital h = hospitalRepository.findById(id).orElseThrow();
        h.setName(hospitalName);
        hospitalRepository.save(h);
    }

    public void deleteHospital(Long id){
//        hospitalRepository.deleteHospital(id);
        hospitalRepository.deleteById(id);
    }

}
