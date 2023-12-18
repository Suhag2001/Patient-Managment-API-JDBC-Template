package com.bootcoding.controller;

import com.bootcoding.model.Patient;
import com.bootcoding.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService service ;
    @PostMapping("/patient")
    public void  insert(@RequestBody Patient p1){
    service.insert(p1);
    }

    @GetMapping("/patient/{id}")
    public Patient select(@PathVariable int id){
        return service.select(id);
    }

    @PutMapping("/patient")
    public Patient update(@RequestBody Patient p1){
        return service.update(p1);
    }

    @DeleteMapping("/patient/{id}")
    public void delete(@PathVariable int id){
         service.delete(id);
    }

    @GetMapping("/patients")
    public List<Patient> selectAll(){
        return service.selectAll();
    }

    @GetMapping("/patient/id/{id}")
    public Patient getById(@PathVariable int id){
        return service.getById(id);
    }


}
