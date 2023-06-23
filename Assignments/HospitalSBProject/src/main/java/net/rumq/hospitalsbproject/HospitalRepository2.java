package net.rumq.hospitalsbproject;

import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

//This is the repository where we build CRUD operations from scratch
@Repository
public class HospitalRepository2 {

    @PersistenceContext
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
