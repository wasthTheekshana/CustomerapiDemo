package com.wasathDev.customerapiDemo.repositories;

import com.wasathDev.customerapiDemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
