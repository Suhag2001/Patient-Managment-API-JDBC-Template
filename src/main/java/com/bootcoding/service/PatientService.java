package com.bootcoding.service;

import com.bootcoding.model.Patient;

import java.util.List;

public interface PatientService {

    void insert(Patient p1);
    Patient select(int id);

    Patient update(Patient p1);
    void delete(int id);
    List<Patient> selectAll();

    Patient getById(int id);
}
