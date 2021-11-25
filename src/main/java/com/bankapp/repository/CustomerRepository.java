package com.bankapp.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.bankapp.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
  List<Customer> findByEmail(String email);
}
