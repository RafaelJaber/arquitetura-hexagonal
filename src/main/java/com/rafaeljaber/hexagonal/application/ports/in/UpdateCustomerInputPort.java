package com.rafaeljaber.hexagonal.application.ports.in;

import com.rafaeljaber.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
