package com.rafaeljaber.hexagonal.application.ports.in;

import com.rafaeljaber.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
