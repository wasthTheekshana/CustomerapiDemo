package com.wasathDev.customerapiDemo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="V_Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    private FullName name;
    private String email;
    private long mobileNo;
    private LocalDate dob;



}
