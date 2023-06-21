package net.rumq.hospitalsbproject;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class HospitalRepository {

    protected EntityManager entityManager;

    public long getHospitalCount(){
        String jpql = "select count(h) from Hospital h";
        TypedQuery<Long> query = entityManager.createQuery(jpql, Long.class);
        return query.getSingleResult();
    }

    public Hospital getHospital(long hospitalId){
        return entityManager.find(Hospital.class, hospitalId);
    }

    public List<Hospital> getHospitals(){
        String jpql = "select h from Hopital r";
        TypedQuery<Hospital> query = entityManager.createQuery(jpql, Hospital.class);
        return query.getResultList();
    }

    @Transactional
    public void insertHospital(Hospital hospital){
        entityManager.persist(hospital);

    }

    @Transactional
    public void updateHospital(int id, String hospitalName){
        Hospital hospital = entityManager.find(Hospital.class, id);
        hospital.setName(hospitalName);
    }

    @Transactional
    public void deleteHospital(int id) {
        Hospital hospital = entityManager.find(Hospital.class, id);
        entityManager.remove(hospital);
    }

}
