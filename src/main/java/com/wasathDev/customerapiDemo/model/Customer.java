package com.wasathDev.customerapiDemo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="V_Customer")
@XmlRootElement
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private long customerId;
    @Embedded
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
