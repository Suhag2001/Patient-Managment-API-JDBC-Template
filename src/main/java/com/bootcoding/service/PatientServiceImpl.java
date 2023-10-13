package com.bootcoding.service;

import com.bootcoding.model.Patient;
import com.bootcoding.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepo repo;
    @Override
    public void insert(Patient p1){
        repo.insert(p1);
    }

    @Override
    public Patient select(int id){
        return repo.select(id);
    }

    @Override
    public Patient update(Patient p1){
        return repo.update(p1);
    }

    @Override
    public void delete(int id){
         repo.delete(id);
    }

    @Override
    public List<Patient> selectAll(){
        return repo.selectAll();
    }


}
