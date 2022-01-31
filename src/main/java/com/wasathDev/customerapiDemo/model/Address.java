package com.wasathDev.customerapiDemo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Global_Address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Address_Ref")
    private long addressId;
    @Column(name = "Door_No")
    private String doorNo;
    @Column(name = "Street_Name")
    private String streetName;
    @Column(name = "City")
    private String city;
    @Column(name = "ZipCode")
    private long ZipCode;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer_Id")
    private Customer customer;

//    streetName,city,zipcode,country
}
