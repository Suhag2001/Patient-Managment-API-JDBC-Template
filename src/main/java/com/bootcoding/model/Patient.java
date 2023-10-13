package com.bootcoding.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private  int id ;
    private String name ;
    private String gender ;
    private int age ;
    private String disease ;
}
