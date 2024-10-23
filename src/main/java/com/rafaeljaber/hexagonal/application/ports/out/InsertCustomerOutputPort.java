package com.rafaeljaber.hexagonal.application.ports.out;

import com.rafaeljaber.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
