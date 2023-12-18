package com.bootcoding.repo;

import com.bootcoding.model.Patient;

import java.util.List;

public interface PatientRepo {

    void insert(Patient p1);

    Patient select(int id);

    Patient update(Patient p1);

    void delete(int id);
    List<Patient> selectAll();

    Patient getById(int id);
}
