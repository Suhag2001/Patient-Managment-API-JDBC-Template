package com.bootcoding.repo;

import com.bootcoding.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class PatientRepoImpl implements PatientRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void insert(Patient p1){
      jdbcTemplate.update("insert into petient(name,gender,age,disease) values(?,?,?,?)",p1.getName(),p1.getGender(),p1.getAge(),p1.getDisease());
    }

    @Override
    public Patient select(int id){
        return jdbcTemplate.queryForObject("select * from petient where id=?",(rs, rowNum) -> {
            return new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("gender"),rs.getInt("age"),rs.getString("disease"));
        },id);
    }

    @Override
    public Patient update(Patient p1){
        jdbcTemplate.update("update petient set name=? , gender=?, age=?,disease=? where id=?",p1.getName(),p1.getGender(),p1.getAge(),p1.getDisease(),p1.getId());
        return p1;
    }

    @Override
    public void delete(int id){
       jdbcTemplate.update("delete from petient where id=?",id);
    }

    @Override
    public List<Patient> selectAll() {
        return  jdbcTemplate.query("select * from  petient" ,(rs, rowNum) -> {
           return new Patient(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
        });
    }
}
