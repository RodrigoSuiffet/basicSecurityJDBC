package com.bankapp.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.model.Customer;
import com.bankapp.repository.CustomerRepository;
@Service
public class BankAppUserDetails implements UserDetailsService {

  @Autowired
  private CustomerRepository customerRepository;


  @Override public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    List<Customer> customer = customerRepository.findByEmail(username);
    if (customer.size()==0) {
      throw new UsernameNotFoundException("Usuario no encontrado: " + username);
    }
    return new SecurityCustomer(customer.get(0));
  }
}
