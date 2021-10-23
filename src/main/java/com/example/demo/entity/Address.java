package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "AddressService")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADDRESS_ID")
    private Long id;
    private String street;

    public Address(String street) {
        this.street = street;
    }
}