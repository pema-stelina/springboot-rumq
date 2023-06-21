package net.rumq.hospitalsbproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    public long getHospitalCount(){
        return hospitalRepository.getHospitalCount();
    }

    public Hospital getHospital(long hospitalId){
        return hospitalRepository.getHospital(hospitalId);
    }

    public List<Hospital> getHospitals(){
        return hospitalRepository.getHospitals();
    }

    public void insertHospital(Hospital hospital){
        hospitalRepository.insertHospital(hospital);
    }

    public void updateHospital(int id, String hospital){
        hospitalRepository.updateHospital(id, hospital);
    }

    public void deleteHospital(int id){
        hospitalRepository.deleteHospital(id);
    }

}
