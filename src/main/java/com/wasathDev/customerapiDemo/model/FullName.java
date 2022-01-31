package com.wasathDev.customerapiDemo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class FullName {

    @Column(name = "First_Name",nullable = false,length = 50)
    private String firstName;
    @Column(name = "Last_Name",nullable = false,length = 50)
    private String lastName;
    @Column(name = "Middle_Name",nullable = false,length = 50)
    private String middleName;
}
