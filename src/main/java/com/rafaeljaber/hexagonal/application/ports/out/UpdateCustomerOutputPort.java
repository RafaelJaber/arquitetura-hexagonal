package com.rafaeljaber.hexagonal.application.ports.out;

import com.rafaeljaber.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
