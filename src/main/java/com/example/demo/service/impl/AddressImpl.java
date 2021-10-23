package com.example.demo.service.impl;

import com.example.demo.dao.AddressDao;
import com.example.demo.entity.Address;
import com.example.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressImpl implements AddressService {

    @Autowired
    AddressDao addressDao;

    @Override
    public Address saveAddress(Address address) {



        return addressDao.save(address);
    }
}
