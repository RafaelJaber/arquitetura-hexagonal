package com.rafaeljaber.hexagonal.adapters.out;

import com.rafaeljaber.hexagonal.adapters.out.repository.CustomerRepository;
import com.rafaeljaber.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rafaeljaber.hexagonal.application.core.domain.Customer;
import com.rafaeljaber.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(customerEntityMapper::toCustomer);
    }

}
