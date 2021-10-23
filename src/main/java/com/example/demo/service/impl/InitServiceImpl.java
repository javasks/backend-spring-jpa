package com.example.demo.service.impl;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.entity.OnlineBookStore;
import com.example.demo.service.AddressService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.InitService;
import com.example.demo.service.OnlineBookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitServiceImpl implements InitService {

   /* @Autowired
    EmployeeService employeeService;*/


    @Autowired
    OnlineBookStoreService onlineBookStoreService;

    @Autowired
    AddressService addressService;


    @Autowired
    EmployeeService employeeService;

    @Override
    public void init() {
        /**
         * Method to publish books
         */

        publishBook();


        /**
         * method to save employee
         */
        saveEmployee();

        /**
         * For saving address
         */

        saveAddress();
    }

    private void saveAddress() {

        Address address = new Address("Bangalore street");
        addressService.saveAddress(address);

    }

    private void saveEmployee() {
        Employee employee = new Employee();
        employee.setDepartment("CSE");
        employee.setFirstName("Sandeep");
        employee.setLastName("Singh");
        employeeService.createEmployee(employee);
    }


    /**
     * This method is for publishing books on online
     * platform
     */
    private void publishBook() {
        OnlineBookStore onlineBookStore = new OnlineBookStore();
        onlineBookStore.setPlatoForm("Online Platform");
        onlineBookStore.setAuthorName("Ankit");
        onlineBookStore.setPublisherName("ABC");
        onlineBookStore.setBookName("Design PAttern");

        OnlineBookStore onlineBookStore3 = new OnlineBookStore();
        onlineBookStore3.setPlatoForm("Online Platform");
        onlineBookStore3.setAuthorName("Ramesh");
        onlineBookStore3.setPublisherName("XYZ");
        onlineBookStore3.setBookName("MicroservicesDesign");

        OnlineBookStore onlineBookStore2 = new OnlineBookStore();
        onlineBookStore2.setAuthorName("Sandeep");
        onlineBookStore2.setBookName("javSKS");
        onlineBookStore2.setPlatoForm("Online platform");
        onlineBookStore2.setPublisherName("XYZ");
        onlineBookStoreService.publishNewBook(onlineBookStore2);
        onlineBookStoreService.publishNewBook(onlineBookStore);
        onlineBookStoreService.publishNewBook(onlineBookStore3);

        //System.out.println(onlineBookStoreService.getAllBooks());
    }
}
