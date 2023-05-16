package com.practice.week6.CustomerRegistration;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="customer")
@Getter
public class Customer {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private int age;

    @Column(name = "Email")
    private String email;

}
