package com.wasathDev.customerapiDemo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="V_Customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private long customerId;
    @Column(name = "Name", nullable = false,length = 70)
    private FullName name;
    @Column(name = "Email", nullable = false,length = 100)
    private String email;
    @Column(name = "Mobile_No")
    private long mobileNo;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "dob")
    private LocalDate dob;



}
