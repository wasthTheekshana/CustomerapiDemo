package com.wasathDev.customerapiDemo.services;

import com.wasathDev.customerapiDemo.model.Customer;
import com.wasathDev.customerapiDemo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    //insert the customer
    public Customer SaveCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }

    //findAll
    public List<Customer> getAllcustomer(){
        return this.customerRepository.findAll();
    }

    public Customer getCustomerById(long customerId){
        return this.customerRepository.findById(customerId).orElse(null);
    }

    //delete the customer
    // select where by customerId

    public void deleteCustomerById(long customerId){
        this.customerRepository.deleteById(customerId);
    }

    public Customer updateCustomer(Customer customer){
        return this.customerRepository.save(customer);
    }

    public List<Customer> findPaginated(int pageNo, int pageSize){
        Pageable paging  = PageRequest.of(pageNo,pageSize);
        Page<Customer> pagedResult = customerRepository.findAll(paging);
        return pagedResult.toList();
    }
}
