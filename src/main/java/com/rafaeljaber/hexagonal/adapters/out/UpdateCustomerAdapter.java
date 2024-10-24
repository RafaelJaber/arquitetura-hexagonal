package com.rafaeljaber.hexagonal.adapters.out;

import com.rafaeljaber.hexagonal.adapters.out.repository.CustomerRepository;
import com.rafaeljaber.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.rafaeljaber.hexagonal.application.core.domain.Customer;
import com.rafaeljaber.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
